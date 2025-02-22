// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.modsecurity;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.modsecurity.global.modsecurity.*;


/** \ingroup ModSecurity_CPP_API */
@Namespace("modsecurity::audit_log") @NoOffset @Properties(inherit = org.bytedeco.modsecurity.presets.modsecurity.class)
public class AuditLog extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AuditLog(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AuditLog(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AuditLog position(long position) {
        return (AuditLog)super.position(position);
    }
    @Override public AuditLog getPointer(long i) {
        return new AuditLog((Pointer)this).offsetAddress(i);
    }

    public AuditLog() { super((Pointer)null); allocate(); }
    private native void allocate();

    

    /** enum modsecurity::audit_log::AuditLog::AuditLogType */
    public static final int
     NotSetAuditLogType = 0,
     SerialAuditLogType = 1,
     ParallelAuditLogType = 2,
     HttpsAuditLogType = 3;

    /** enum modsecurity::audit_log::AuditLog::AuditLogStatus */
    public static final int
     NotSetLogStatus = 0,
     OnAuditLogStatus = 1,
     OffAuditLogStatus = 2,
     RelevantOnlyAuditLogStatus = 3;

    /** enum modsecurity::audit_log::AuditLog::AuditLogFormat */
    public static final int
     NotSetAuditLogFormat = 0,
     JSONAuditLogFormat = 1,
     NativeAuditLogFormat = 2;

    /** enum modsecurity::audit_log::AuditLog::AuditLogParts */
    public static final int
     /**
      * Audit log header (mandatory).
      * 
      */
     AAuditLogPart = 2,

     /**
      * Request headers.
      * 
      */
     BAuditLogPart = 4,

     /**
      * Request body (present only if the request body exists and ModSecurity
      * is configured to intercept it).
      * 
      */     
     CAuditLogPart = 8,

     /**
      * Reserved for intermediary response headers; not implemented yet.
      * 
      */     
     DAuditLogPart = 16,

     /**
      * Intermediary response body (present only if ModSecurity is configured
      * to intercept response bodies, and if the audit log engine is
      * configured to record it). Intermediary response body is the same as the
      * actual response body unless ModSecurity intercepts the intermediary
      * response body, in which case the actual response body will contain the
      * error message (either the Apache default error message, or the
      * ErrorDocument page).
      *
      */
     EAuditLogPart = 32,

     /**
      * Final response headers (excluding the Date and Server headers, which
      * are always added by Apache in the late stage of content delivery).
      * 
      */
     FAuditLogPart = 64,

     /**
      * Reserved for the actual response body; not implemented yet.
      * 
      */
     GAuditLogPart = 128,

     /**
      * Audit log trailer.
      * 
      */
     HAuditLogPart = 256,

     /**
      * This part is a replacement for part C. It will log the same data as C
      * in all cases except when multipart/form-data encoding in used. In this
      * case, it will log a fake application/x-www-form-urlencoded body that
      * contains the information about parameters but not about the files. This
      * is handy if you don’t want to have (often large) files stored in your
      * audit logs.
      * 
      */
     IAuditLogPart = 512,

     /**
      * This part contains information about the files uploaded using
      * multipart/form-data encoding.
      */
     JAuditLogPart = 1024,

     /**
      * This part contains a full list of every rule that matched (one per
      * line) in the order they were matched. The rules are fully qualified and
      * will thus show inherited actions and default operators. Supported as of
      * v2.5.0.
      * 
      */
     KAuditLogPart = 2048,

     /**
      * Final boundary, signifies the end of the entry (mandatory).
      * 
      */
     ZAuditLogPart = 4096;

    public native @Cast("bool") boolean setStorageDirMode(int permission);
    public native @Cast("bool") boolean setFileMode(int permission);
    public native @Cast("bool") boolean setStatus(@Cast("modsecurity::audit_log::AuditLog::AuditLogStatus") int new_status);
    public native @Cast("bool") boolean setRelevantStatus(@StdString BytePointer new_relevant_status);
    public native @Cast("bool") boolean setFilePath1(@StdString BytePointer path);
    public native @Cast("bool") boolean setFilePath2(@StdString BytePointer path);
    public native @Cast("bool") boolean setStorageDir(@StdString BytePointer path);
    public native @Cast("bool") boolean setFormat(@Cast("modsecurity::audit_log::AuditLog::AuditLogFormat") int fmt);

    public native int getDirectoryPermission();
    public native int getFilePermission();
    public native int getParts();

    public native @Cast("bool") boolean setParts(@StdString BytePointer new_parts);
    public native @Cast("bool") boolean setType(@Cast("modsecurity::audit_log::AuditLog::AuditLogType") int audit_type);

    public native @Cast("bool") boolean init(@StdString @Cast({"char*", "std::string*"}) BytePointer error);
    public native @Cast("bool") @Name("close") boolean _close();

    public native @Cast("bool") boolean saveIfRelevant(Transaction transaction);
    public native @Cast("bool") boolean saveIfRelevant(Transaction transaction, int parts);
    public native @Cast("bool") boolean isRelevant(int status);

    public static native int addParts(int parts, @StdString BytePointer new_parts);
    public static native int addParts(int parts, @StdString String new_parts);
    public static native int removeParts(int parts, @StdString BytePointer new_parts);
    public static native int removeParts(int parts, @StdString String new_parts);

    public native @Cast("bool") boolean merge(AuditLog from, @StdString @Cast({"char*", "std::string*"}) BytePointer error);

    public native @StdString BytePointer m_path1(); public native AuditLog m_path1(BytePointer setter);
    public native @StdString BytePointer m_path2(); public native AuditLog m_path2(BytePointer setter);
    public native @StdString BytePointer m_storage_dir(); public native AuditLog m_storage_dir(BytePointer setter);

    public native @Cast("modsecurity::audit_log::AuditLog::AuditLogFormat") int m_format(); public native AuditLog m_format(int setter);
}
