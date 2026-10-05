/*
 * Decompiled with CFR 0.152.
 */
public final class m
extends x {
    m(ag ag2) {
        super(0, ag2);
    }

    public final x a() {
        m m2 = this;
        m2.a.a(false);
        x x2 = null;
        m2 = this;
        if (m2.a.a().a()) {
            m2 = this;
            x2 = m2.a.d();
        } else {
            m2 = this;
            x2 = m2.a.c();
        }
        m2 = this;
        return m2.a.a(this, x2);
    }

    public final x b() {
        m m2 = this;
        m2.a.a(true);
        Object object = null;
        m2 = this;
        object = m2.a;
        if (((ag)object).a().a()) {
            object = ((ag)object).d();
        } else {
            m2 = this;
            object = !m2.a.c() ? ((ag)object).b() : (((ag)object).e() ? ((ag)object).e() : (((ag)object).d() ? ((ag)object).j() : ((ag)object).f()));
        }
        m2 = this;
        return m2.a.a(this, (x)object);
    }
}

