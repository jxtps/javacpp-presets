// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;


@Namespace("dai") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkStream extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkStream(Pointer p) { super(p); }

    public XLinkStream(@SharedPtr XLinkConnection conn, @StdString BytePointer name, @Cast("std::size_t") long maxWriteSize) { super((Pointer)null); allocate(conn, name, maxWriteSize); }
    private native void allocate(@SharedPtr XLinkConnection conn, @StdString BytePointer name, @Cast("std::size_t") long maxWriteSize);
    public XLinkStream(@SharedPtr XLinkConnection conn, @StdString ByteBuffer name, @Cast("std::size_t") long maxWriteSize) { super((Pointer)null); allocate(conn, name, maxWriteSize); }
    private native void allocate(@SharedPtr XLinkConnection conn, @StdString ByteBuffer name, @Cast("std::size_t") long maxWriteSize);
    public XLinkStream(@SharedPtr XLinkConnection conn, @StdString String name, @Cast("std::size_t") long maxWriteSize) { super((Pointer)null); allocate(conn, name, maxWriteSize); }
    private native void allocate(@SharedPtr XLinkConnection conn, @StdString String name, @Cast("std::size_t") long maxWriteSize);
    
    public XLinkStream(@ByRef(true) XLinkStream stream) { super((Pointer)null); allocate(stream); }
    private native void allocate(@ByRef(true) XLinkStream stream);
    
    public native @ByRef @Name("operator =") XLinkStream put(@ByRef(true) XLinkStream stream);

    // Blocking
    public native void write(@Const Pointer data, @Cast("std::size_t") long size);
    public native void write(@Cast("const std::uint8_t*") BytePointer data, @Cast("std::size_t") long size);
    public native void write(@Cast("const std::uint8_t*") ByteBuffer data, @Cast("std::size_t") long size);
    public native void write(@Cast("const std::uint8_t*") byte[] data, @Cast("std::size_t") long size);
    public native void write(@Cast("std::uint8_t*") @StdVector BytePointer data);
    public native void write(@Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native void write(@Cast("std::uint8_t*") @StdVector byte[] data);
    public native @Cast("std::uint8_t*") @StdVector @Function BytePointer read();
    public native @Function void read(@Cast("std::uint8_t*") @StdVector BytePointer data);
    public native @Function void read(@Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native @Function void read(@Cast("std::uint8_t*") @StdVector byte[] data);
    // split write helper
    public native void writeSplit(@Const Pointer data, @Cast("std::size_t") long size, @Cast("std::size_t") long split);
    public native void writeSplit(@Cast("uint8_t*") @StdVector BytePointer data, @Cast("std::size_t") long split);
    public native void writeSplit(@Cast("uint8_t*") @StdVector ByteBuffer data, @Cast("std::size_t") long split);
    public native void writeSplit(@Cast("uint8_t*") @StdVector byte[] data, @Cast("std::size_t") long split);
    public native @ByVal StreamPacketDesc readMove();

    // Timeout
    public native @Cast("bool") boolean write(@Const Pointer data, @Cast("std::size_t") long size, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") boolean write(@Cast("const std::uint8_t*") BytePointer data, @Cast("std::size_t") long size, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") boolean write(@Cast("const std::uint8_t*") ByteBuffer data, @Cast("std::size_t") long size, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") boolean write(@Cast("const std::uint8_t*") byte[] data, @Cast("std::size_t") long size, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") boolean write(@Cast("std::uint8_t*") @StdVector BytePointer data, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") boolean write(@Cast("std::uint8_t*") @StdVector ByteBuffer data, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") boolean write(@Cast("std::uint8_t*") @StdVector byte[] data, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") @Function boolean read(@Cast("std::uint8_t*") @StdVector BytePointer data, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") @Function boolean read(@Cast("std::uint8_t*") @StdVector ByteBuffer data, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") @Function boolean read(@Cast("std::uint8_t*") @StdVector byte[] data, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    public native @Cast("bool") boolean readMove(@ByRef StreamPacketDesc packet, @ByVal @Cast("const std::chrono::milliseconds*") Pointer timeout);
    // TODO optional<StreamPacketDesc> readMove(timeout) -or- tuple<bool, StreamPacketDesc> readMove(timeout)

    // deprecated use readMove() instead; readRaw leads to memory violations and/or memory leaks
    public native @Deprecated streamPacketDesc_t readRaw();
    // deprecated use readMove(packet, timeout) instead; readRaw leads to memory violations and/or memory leaks
    public native @Cast("bool") @Deprecated boolean readRaw(@ByPtrRef streamPacketDesc_t pPacket, @ByVal @Cast("std::chrono::milliseconds*") Pointer timeout);
    // deprecated; unsafe leads to memory violations and/or memory leaks
    public native @Deprecated void readRawRelease();

    public native @Cast("streamId_t") int getStreamId();
}
