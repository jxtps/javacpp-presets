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

@Name("dai::PropertiesSerializable<dai::NeuralNetworkProperties,dai::DetectionNetworkProperties>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class DetectionNetworkPropertiesSerializable extends NeuralNetworkProperties {
    static { Loader.load(); }
    /** Default native constructor. */
    public DetectionNetworkPropertiesSerializable() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectionNetworkPropertiesSerializable(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectionNetworkPropertiesSerializable(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DetectionNetworkPropertiesSerializable position(long position) {
        return (DetectionNetworkPropertiesSerializable)super.position(position);
    }
    @Override public DetectionNetworkPropertiesSerializable getPointer(long i) {
        return new DetectionNetworkPropertiesSerializable((Pointer)this).offsetAddress(i);
    }

    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer data);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] data);

    public native @UniquePtr @Override DaiProperties clone();
}
