import subprocess
import urllib.request
import json

cmd = ['git', 'credential', 'fill']
input_data = 'protocol=https\nhost=github.com\n\n'
res = subprocess.run(cmd, input=input_data, capture_output=True, text=True)
token = None
for l in res.stdout.splitlines():
    if l.startswith('password='):
        token = l.split('=', 1)[1]

if not token:
    print('No token found')
    exit(1)

headers = {
    'User-Agent': 'Mozilla/5.0',
    'Authorization': f'Bearer {token}',
    'Accept': 'application/vnd.github+json'
}

url = 'https://api.github.com/repos/tayga16/gish-port/actions/runs'
req = urllib.request.Request(url, headers=headers)
with urllib.request.urlopen(req) as resp:
    data = json.loads(resp.read().decode('utf-8'))

runs = data.get('workflow_runs', [])
if not runs:
    print('No runs found')
    exit(0)

latest_run = runs[0]
print("Latest Run ID:", latest_run["id"])
print("Run Status:", latest_run["status"])
print("Run Conclusion:", latest_run["conclusion"])
print("Run HTML URL:", latest_run["html_url"])

jobs_url = latest_run['jobs_url']
jreq = urllib.request.Request(jobs_url, headers=headers)
with urllib.request.urlopen(jreq) as jresp:
    jobs_data = json.loads(jresp.read().decode('utf-8'))

for job in jobs_data.get('jobs', []):
    print(f"Job: {job['name']} | Status: {job['status']} | Conclusion: {job['conclusion']}")
    for step in job.get('steps', []):
        if step.get('conclusion') == 'failure':
            print(f"   FAILED Step: {step['name']}")
