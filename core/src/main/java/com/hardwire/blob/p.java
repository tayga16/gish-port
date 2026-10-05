package com.hardwire.blob;

/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.microedition.io.Connector
 *  javax.microedition.io.HttpConnection
 */
import com.hardwire.blob.Main;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class p
implements Runnable {
    private Main a;
    byte[] a;
    String a;
    private boolean a;
    byte a;
    private HttpConnection a = null;

    /*
     * Loose catch block
     */
    public final void run() {
        StringBuffer stringBuffer;
        block37: {
            OutputStream outputStream;
            InputStream inputStream;
            block36: {
                String string = "http://hardwire.cz:80/gish/";
                switch (this.a) {
                    case 0: {
                        string = string + "upload_score.php";
                    }
                }
                string = string.replace(' ', '+');
                Main.c = false;
                this.a = null;
                inputStream = null;
                outputStream = null;
                stringBuffer = null;
                this.a = false;
                this.a = (HttpConnection)Connector.open((String)string, (int)3);
                if (this.a == null) break block36;
                this.a.setRequestProperty("Content-Type", "application/octet-stream");
                this.a.setRequestProperty("Content-Length", Integer.toString(this.a.length + (this.a == null ? 0 : this.a.length())));
                this.a.setRequestMethod("POST");
                outputStream = this.a.openOutputStream();
                if (this.a != null) {
                    outputStream.write(this.a.getBytes());
                }
                outputStream.write(this.a);
                int n2 = this.a.getResponseCode();
                switch (n2) {
                    case 200: 
                    case 201: {
                        stringBuffer = new StringBuffer();
                        inputStream = this.a.openInputStream();
                        while ((n2 = inputStream.read()) != -1) {
                            stringBuffer.append((char)n2);
                        }
                        if (stringBuffer.toString().compareTo("ok") == 0) break;
                        this.a = true;
                        break;
                    }
                    default: {
                        this.a = true;
                    }
                }
            }
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
                if (this.a != null) {
                    this.a.close();
                }
            }
            catch (IOException iOException) {}
            this.a = null;
            break block37;
            catch (Exception exception) {
                try {
                    this.a = true;
                }
                catch (Throwable throwable) {
                    try {
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (this.a != null) {
                            this.a.close();
                        }
                    }
                    catch (IOException iOException) {}
                    this.a = null;
                    throw throwable;
                }
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    if (this.a != null) {
                        this.a.close();
                    }
                }
                catch (IOException iOException) {}
                this.a = null;
            }
        }
        Main.c = true;
        if (stringBuffer != null && stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == '\u0000') {
            stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
        }
        if (stringBuffer != null && stringBuffer.toString().compareTo("ok") != 0) {
            this.a = true;
        }
        try {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedException) {}
        if (this.a) {
            this.a.a.a((byte)34);
        } else {
            switch (this.a) {
                case 0: {
                    this.a.a.a((byte)35);
                }
            }
        }
        this.a = null;
        this.a = null;
    }

    public p(Main main) {
        this.a = main;
    }
}

