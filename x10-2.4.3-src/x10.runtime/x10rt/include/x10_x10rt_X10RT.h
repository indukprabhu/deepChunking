/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class x10_x10rt_X10RT */

#ifndef _Included_x10_x10rt_X10RT
#define _Included_x10_x10rt_X10RT
#ifdef __cplusplus
extern "C" {
#endif
#undef x10_x10rt_X10RT_REPORT_UNCAUGHT_USER_EXCEPTIONS
#define x10_x10rt_X10RT_REPORT_UNCAUGHT_USER_EXCEPTIONS 1L
#undef x10_x10rt_X10RT_VERBOSE
#define x10_x10rt_X10RT_VERBOSE 0L
/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_preinit
 * Signature: ()Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_x10_x10rt_X10RT_x10rt_1preinit
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_init
 * Signature: (I[Ljava/lang/String;)I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1init
  (JNIEnv *, jclass, jint, jobjectArray);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_finalize
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1finalize
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_registration_complete
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1registration_1complete
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_nplaces
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1nplaces
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_ndead
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1ndead
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_is_place_dead
 * Signature: (I)Z
 */
JNIEXPORT jboolean JNICALL Java_x10_x10rt_X10RT_x10rt_1is_1place_1dead
  (JNIEnv *, jclass, jint);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_here
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1here
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_coll_support
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1coll_1support
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_probe
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1probe
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_blocking_probe_support
 * Signature: ()Z
 */
JNIEXPORT jboolean JNICALL Java_x10_x10rt_X10RT_x10rt_1blocking_1probe_1support
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_blocking_probe
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1blocking_1probe
  (JNIEnv *, jclass);

/*
 * Class:     x10_x10rt_X10RT
 * Method:    x10rt_unblock_probe
 * Signature: ()I
 */
JNIEXPORT jint JNICALL Java_x10_x10rt_X10RT_x10rt_1unblock_1probe
  (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif
