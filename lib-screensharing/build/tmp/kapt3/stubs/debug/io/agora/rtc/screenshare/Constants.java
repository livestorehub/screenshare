package io.agora.rtc.screenshare;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lio/agora/rtc/screenshare/Constants;", "", "()V", "Companion", "lib-screensharing_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ENTERPRISEAPIKEY = "enterpriseApiKey";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ENTERPRISEKEY = "enterpriseKey";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String ENTERPRISESECRET = "enterpriseSecret";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CUSTOMERID = "customerId";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CUSTOMERFIRSTNAME = "customerFirstName";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CUSTOMERLASTNAME = "customerLastName";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CUSTOMEREMAIL = "customerEmail";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CUSTOMERPHONE = "customerPhone";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CLASSOBJECT = "classobject";
    @org.jetbrains.annotations.NotNull()
    public static java.lang.String TOKEN = "token";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String stop = "stop";
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CONNECTION_DATA = "data";
    @org.jetbrains.annotations.Nullable()
    public static android.content.Context sscontext;
    @org.jetbrains.annotations.Nullable()
    private static android.app.Activity activity;
    @org.jetbrains.annotations.Nullable()
    public static io.agora.rtc.screenshare.ShareCallBack ssCallBack;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String BASE_URL = "https://test.dronisoft.com/lsh_screenshare/api/web/";
    @org.jetbrains.annotations.NotNull()
    public static final io.agora.rtc.screenshare.Constants.Companion Companion = null;
    
    public Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u00105\u001a\u0002062\u0006\u00107\u001a\u000201R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u0012\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0004\u0018\u00010)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\u0004\u0018\u00010/8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00100\u001a\u0004\u0018\u0001018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u00102\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\b\u00a8\u00068"}, d2 = {"Lio/agora/rtc/screenshare/Constants$Companion;", "", "()V", "BASE_URL", "", "getBASE_URL", "()Ljava/lang/String;", "setBASE_URL", "(Ljava/lang/String;)V", "CLASSOBJECT", "getCLASSOBJECT", "setCLASSOBJECT", "CONNECTION_DATA", "getCONNECTION_DATA", "setCONNECTION_DATA", "CUSTOMEREMAIL", "getCUSTOMEREMAIL", "setCUSTOMEREMAIL", "CUSTOMERFIRSTNAME", "getCUSTOMERFIRSTNAME", "setCUSTOMERFIRSTNAME", "CUSTOMERID", "getCUSTOMERID", "setCUSTOMERID", "CUSTOMERLASTNAME", "getCUSTOMERLASTNAME", "setCUSTOMERLASTNAME", "CUSTOMERPHONE", "getCUSTOMERPHONE", "setCUSTOMERPHONE", "ENTERPRISEAPIKEY", "getENTERPRISEAPIKEY", "setENTERPRISEAPIKEY", "ENTERPRISEKEY", "getENTERPRISEKEY", "setENTERPRISEKEY", "ENTERPRISESECRET", "getENTERPRISESECRET", "setENTERPRISESECRET", "TOKEN", "activity", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "ssCallBack", "Lio/agora/rtc/screenshare/ShareCallBack;", "sscontext", "Landroid/content/Context;", "stop", "getStop", "setStop", "isNetworkAvailable", "", "context", "lib-screensharing_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getENTERPRISEAPIKEY() {
            return null;
        }
        
        public final void setENTERPRISEAPIKEY(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getENTERPRISEKEY() {
            return null;
        }
        
        public final void setENTERPRISEKEY(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getENTERPRISESECRET() {
            return null;
        }
        
        public final void setENTERPRISESECRET(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCUSTOMERID() {
            return null;
        }
        
        public final void setCUSTOMERID(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCUSTOMERFIRSTNAME() {
            return null;
        }
        
        public final void setCUSTOMERFIRSTNAME(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCUSTOMERLASTNAME() {
            return null;
        }
        
        public final void setCUSTOMERLASTNAME(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCUSTOMEREMAIL() {
            return null;
        }
        
        public final void setCUSTOMEREMAIL(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCUSTOMERPHONE() {
            return null;
        }
        
        public final void setCUSTOMERPHONE(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCLASSOBJECT() {
            return null;
        }
        
        public final void setCLASSOBJECT(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getStop() {
            return null;
        }
        
        public final void setStop(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCONNECTION_DATA() {
            return null;
        }
        
        public final void setCONNECTION_DATA(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final android.app.Activity getActivity() {
            return null;
        }
        
        public final void setActivity(@org.jetbrains.annotations.Nullable()
        android.app.Activity p0) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBASE_URL() {
            return null;
        }
        
        public final void setBASE_URL(@org.jetbrains.annotations.NotNull()
        java.lang.String p0) {
        }
        
        public final boolean isNetworkAvailable(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}