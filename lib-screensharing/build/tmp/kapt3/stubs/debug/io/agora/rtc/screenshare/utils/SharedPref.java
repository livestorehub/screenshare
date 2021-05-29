package io.agora.rtc.screenshare.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eJ\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0086\u0002J\u0010\u0010\u0012\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006J$\u0010\u0013\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0006J \u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0006J*\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u001c\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u0010J&\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001fJ\u0018\u0010\u001e\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001d\u001a\u00020\u001fJ \u0010 \u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0006J&\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u0006J\u0018\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lio/agora/rtc/screenshare/utils/SharedPref;", "", "()V", "editor", "Landroid/content/SharedPreferences$Editor;", "prefName", "", "getPrefName", "()Ljava/lang/String;", "setPrefName", "(Ljava/lang/String;)V", "shr", "Landroid/content/SharedPreferences;", "cleardata", "", "contains", "", "key", "getBoolean", "getObject", "context", "Landroid/content/Context;", "classname", "Ljava/lang/reflect/Type;", "getString", "className", "defValue", "initSharedPref", "saveBoolean", "value", "saveInt", "", "saveObject", "object", "saveString", "lib-screensharing_debug"})
public final class SharedPref {
    private static android.content.SharedPreferences shr;
    private static android.content.SharedPreferences.Editor editor;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String prefName = "shas_cust";
    @org.jetbrains.annotations.NotNull()
    public static final io.agora.rtc.screenshare.utils.SharedPref INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefName() {
        return null;
    }
    
    public final void setPrefName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean contains(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return false;
    }
    
    public final void initSharedPref(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void saveString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void saveInt(@org.jetbrains.annotations.Nullable()
    java.lang.String key, int value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return false;
    }
    
    public final void saveBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String key, boolean value) {
    }
    
    public final void saveString(@org.jetbrains.annotations.NotNull()
    java.lang.String className, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    public final void saveInt(@org.jetbrains.annotations.NotNull()
    java.lang.String className, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final void saveObject(@org.jetbrains.annotations.Nullable()
    java.lang.Object object, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getObject(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.reflect.Type classname) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String className, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String className, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    java.lang.String defValue) {
        return null;
    }
    
    public final void cleardata() {
    }
    
    private SharedPref() {
        super();
    }
}