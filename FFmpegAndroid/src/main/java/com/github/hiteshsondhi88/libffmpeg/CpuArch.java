package com.github.hiteshsondhi88.libffmpeg;

import android.text.TextUtils;

enum CpuArch {
    x86("a1a8f2e287d42a910271635afc79876ce7cbc0b8"),
    ARMv7("40f97046f78d3f268101ce642d2d3e008f423c80"),
    ARMv7_NEON("09ea37fb2ca9eb5bfd6dde72ecad3a9a1f72df18"),
    GENERAL("78d95aa0ecb84e3a35187d4ec75fb48be579433f"),
    NONE(null);

    private String sha1;

    CpuArch(String sha1) {
        this.sha1 = sha1;
    }

    String getSha1(){
        return sha1;
    }

    static CpuArch fromString(String sha1) {
        if (!TextUtils.isEmpty(sha1)) {
            for (CpuArch cpuArch : CpuArch.values()) {
                if (sha1.equalsIgnoreCase(cpuArch.sha1)) {
                    return cpuArch;
                }
            }
        }
        return NONE;
    }
}
