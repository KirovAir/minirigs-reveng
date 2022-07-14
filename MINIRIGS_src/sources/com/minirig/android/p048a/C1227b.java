package com.minirig.android.p048a;

/* renamed from: com.minirig.android.a.b */
public class C1227b {

    /* renamed from: a */
    protected static final String f4392a = "b";

    /* renamed from: b */
    public int f4393b = 0;

    /* renamed from: a */
    public int mo5464a(int i) {
        if (i < 10300) {
            return 1;
        }
        if (i >= 10300 && i < 10550) {
            return 10;
        }
        if (i >= 10550 && i < 10700) {
            return 20;
        }
        if (i >= 10700 && i < 10800) {
            return 30;
        }
        if (i >= 10800 && i < 10900) {
            return 40;
        }
        if (i >= 10900 && i < 11100) {
            return 50;
        }
        if (i >= 11100 && i < 11350) {
            return 60;
        }
        if (i >= 11350 && i < 11700) {
            return 70;
        }
        if (i < 11700 || i >= 12000) {
            return (i < 12000 || i >= 12300) ? 100 : 90;
        }
        return 80;
    }

    /* renamed from: a */
    public int mo5465a(String str) {
        if (str == null || str.length() < 1) {
            return 1;
        }
        String trim = str.substring(1).trim();
        if (trim.length() != 5) {
            return 1;
        }
        try {
            int parseInt = Integer.parseInt(trim);
            if (this.f4393b == 0) {
                this.f4393b = mo5464a(parseInt);
            } else {
                this.f4393b = m6001b(parseInt);
            }
            return this.f4393b;
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    /* renamed from: b */
    private int m6001b(int i) {
        int i2 = this.f4393b;
        if (i2 == 100) {
            if (i < 12100) {
                return 90;
            }
        } else if (i2 == 90) {
            if (i > 12300) {
                return 100;
            }
            if (i < 11850) {
                return 80;
            }
        } else if (i2 == 80) {
            if (i > 12000) {
                return 90;
            }
            if (i < 11500) {
                return 70;
            }
        } else if (i2 == 70) {
            if (i > 11700) {
                return 80;
            }
            if (i < 11200) {
                return 60;
            }
        } else if (i2 == 60) {
            if (i > 11350) {
                return 70;
            }
            if (i < 10950) {
                return 50;
            }
        } else if (i2 == 50) {
            if (i > 11100) {
                return 60;
            }
            if (i < 10850) {
                return 40;
            }
        } else if (i2 == 40) {
            if (i > 10900) {
                return 50;
            }
            if (i < 10750) {
                return 30;
            }
        } else if (i2 == 30) {
            if (i > 10800) {
                return 40;
            }
            if (i < 10650) {
                return 20;
            }
        } else if (i2 == 20) {
            if (i > 10700) {
                return 30;
            }
            if (i < 10450) {
                return 10;
            }
        } else if (i2 == 10) {
            if (i > 10550) {
                return 20;
            }
            if (i < 10100) {
                return 1;
            }
        } else if (i2 == 1 && i > 10300) {
            return 10;
        }
        return this.f4393b;
    }
}
