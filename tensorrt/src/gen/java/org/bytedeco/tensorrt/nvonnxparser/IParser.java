// Targeted by JavaCPP version 1.5.7: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvonnxparser;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;
import org.bytedeco.tensorrt.nvinfer_plugin.*;
import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;

import static org.bytedeco.tensorrt.global.nvonnxparser.*;


/** \class IParser
 *
 * \brief an object for parsing ONNX models into a TensorRT network definition
 */
@Namespace("nvonnxparser") @Properties(inherit = org.bytedeco.tensorrt.presets.nvonnxparser.class)
public class IParser extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IParser(Pointer p) { super(p); }

    /** \brief Parse a serialized ONNX model into the TensorRT network.
     *         This method has very limited diagnostics. If parsing the serialized model
     *         fails for any reason (e.g. unsupported IR version, unsupported opset, etc.)
     *         it the user responsibility to intercept and report the error.
     *         To obtain a better diagnostic, use the parseFromFile method below.
     *
     * @param serialized_onnx_model Pointer to the serialized ONNX model
     * @param serialized_onnx_model_size Size of the serialized ONNX model
     *        in bytes
     * @param model_path Absolute path to the model file for loading external weights if required
     * @return true if the model was parsed successfully
     * @see getNbErrors() getError()
     */
    public native @Cast("bool") boolean parse(@Const Pointer serialized_onnx_model,
                           @Cast("size_t") long serialized_onnx_model_size,
                           String model_path/*=nullptr*/);
    public native @Cast("bool") boolean parse(@Const Pointer serialized_onnx_model,
                           @Cast("size_t") long serialized_onnx_model_size);
    public native @Cast("bool") boolean parse(@Const Pointer serialized_onnx_model,
                           @Cast("size_t") long serialized_onnx_model_size,
                           @Cast("const char*") BytePointer model_path/*=nullptr*/);

    /** \brief Parse an onnx model file, which can be a binary protobuf or a text onnx model
     *         calls parse method inside.
     *
     * @param File name
     * @param Verbosity Level
     *
     * @return true if the model was parsed successfully
     *
     */
    public native @Cast("bool") boolean parseFromFile(String onnxModelFile, int verbosity);
    public native @Cast("bool") boolean parseFromFile(@Cast("const char*") BytePointer onnxModelFile, int verbosity);

    /** \brief Check whether TensorRT supports a particular ONNX model
     *
     * @param serialized_onnx_model Pointer to the serialized ONNX model
     * @param serialized_onnx_model_size Size of the serialized ONNX model
     *        in bytes
     * @param sub_graph_collection Container to hold supported subgraphs
     * @param model_path Absolute path to the model file for loading external weights if required
     * @return true if the model is supported
     */
    public native @Cast("bool") boolean supportsModel(@Const Pointer serialized_onnx_model,
                                   @Cast("size_t") long serialized_onnx_model_size,
                                   @ByRef SubGraphCollection_t sub_graph_collection,
                                   String model_path/*=nullptr*/);
    public native @Cast("bool") boolean supportsModel(@Const Pointer serialized_onnx_model,
                                   @Cast("size_t") long serialized_onnx_model_size,
                                   @ByRef SubGraphCollection_t sub_graph_collection);
    public native @Cast("bool") boolean supportsModel(@Const Pointer serialized_onnx_model,
                                   @Cast("size_t") long serialized_onnx_model_size,
                                   @ByRef SubGraphCollection_t sub_graph_collection,
                                   @Cast("const char*") BytePointer model_path/*=nullptr*/);

    /** \brief Parse a serialized ONNX model into the TensorRT network
     * with consideration of user provided weights
     *
     * @param serialized_onnx_model Pointer to the serialized ONNX model
     * @param serialized_onnx_model_size Size of the serialized ONNX model
     *        in bytes
     * @return true if the model was parsed successfully
     * @see getNbErrors() getError()
     */
    public native @Cast("bool") boolean parseWithWeightDescriptors(
            @Const Pointer serialized_onnx_model, @Cast("size_t") long serialized_onnx_model_size);

    /** \brief Returns whether the specified operator may be supported by the
     *         parser.
     *
     * Note that a result of true does not guarantee that the operator will be
     * supported in all cases (i.e., this function may return false-positives).
     *
     * @param op_name The name of the ONNX operator to check for support
     */
    public native @Cast("bool") boolean supportsOperator(String op_name);
    public native @Cast("bool") boolean supportsOperator(@Cast("const char*") BytePointer op_name);
    /** \brief destroy this object
     *
     * \warning deprecated and planned on being removed in TensorRT 10.0
     */
    public native @Deprecated void destroy();
    /** \brief Get the number of errors that occurred during prior calls to
     *         \p parse
     *
     * @see getError() clearErrors() IParserError
     */
    public native int getNbErrors();
    /** \brief Get an error that occurred during prior calls to \p parse
     *
     * @see getNbErrors() clearErrors() IParserError
     */
    public native @Const IParserError getError(int index);
    /** \brief Clear errors from prior calls to \p parse
     *
     * @see getNbErrors() getError() IParserError
     */
    public native void clearErrors();
}
