/*************************************************/
/* START of PutbackReader */
#include <x10/io/PutbackReader.h>

#include <x10/io/FilterReader.h>
#include <x10/lang/Byte.h>
#include <x10/util/GrowableRail.h>
#include <x10/io/Reader.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Rail.h>
#include <x10/lang/Int.h>
#include <x10/compiler/Synthetic.h>

//#line 17 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
void x10::io::PutbackReader::_constructor(::x10::io::Reader* r) {
    
    //#line 20 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    (this)->::x10::io::FilterReader::_constructor(r);
    
    //#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    ::x10::io::PutbackReader* this__87804 = this;
    
    //#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    this->FMGL(putback) = (__extension__ ({
        ::x10::util::GrowableRail<x10_byte>* alloc__87787 =  (new (::x10aux::alloc_z< ::x10::util::GrowableRail<x10_byte> >()) ::x10::util::GrowableRail<x10_byte>());
        
        //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
        (alloc__87787)->::x10::util::GrowableRail<x10_byte>::_constructor(
          ((x10_long)0ll));
        alloc__87787;
    }))
    ;
}
::x10::io::PutbackReader* x10::io::PutbackReader::_make(::x10::io::Reader* r)
{
    ::x10::io::PutbackReader* this_ = new (::x10aux::alloc_z< ::x10::io::PutbackReader>()) ::x10::io::PutbackReader();
    this_->_constructor(r);
    return this_;
}



//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
x10_byte x10::io::PutbackReader::read() {
    
    //#line 25 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    if ((((__extension__ ({
            ::x10::util::GrowableRail<x10_byte>* this__87792 = this->FMGL(putback);
            ::x10aux::nullCheck(this__87792)->FMGL(size);
        }))
        ) > (((x10_long)0ll)))) {
        
        //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        x10_byte p = (__extension__ ({
            ::x10::util::GrowableRail<x10_byte>* this__87795 = this->FMGL(putback);
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__87794 = (((__extension__ ({
                
                //#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                ::x10::util::GrowableRail<x10_byte>* this__87793 = this->FMGL(putback);
                ::x10aux::nullCheck(this__87793)->FMGL(size);
            }))
            ) - (((x10_long)1ll)));
            x10_byte ret__87796;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__87796 = ::x10aux::nullCheck(::x10aux::nullCheck(this__87795)->FMGL(data))->x10::lang::Rail< x10_byte >::__apply(
                           idx__87794);
            ret__87796;
        }))
        ;
        
        //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        ::x10aux::nullCheck(this->FMGL(putback))->x10::util::GrowableRail<x10_byte>::removeLast();
        
        //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        return p;
        
    }
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    return ::x10::io::FilterReader::read();
    
}

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
void x10::io::PutbackReader::read(::x10::lang::Rail< x10_byte >* r,
                                  x10_int off, x10_int len) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    x10_int read = ((x10_int)0);
    
    //#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    while ((((__extension__ ({
               ::x10::util::GrowableRail<x10_byte>* this__87798 =
                 this->FMGL(putback);
               ::x10aux::nullCheck(this__87798)->FMGL(size);
           }))
           ) > (((x10_long)0ll)))) {
        
        //#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        if (((read) >= (len))) {
            break;
        }
        
        //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        x10_byte p = (__extension__ ({
            ::x10::util::GrowableRail<x10_byte>* this__87801 = this->FMGL(putback);
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            x10_long idx__87800 = (((__extension__ ({
                
                //#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
                ::x10::util::GrowableRail<x10_byte>* this__87799 =
                  this->FMGL(putback);
                ::x10aux::nullCheck(this__87799)->FMGL(size);
            }))
            ) - (((x10_long)1ll)));
            x10_byte ret__87802;
            
            //#line 117 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/util/GrowableRail.x10"
            ret__87802 = ::x10aux::nullCheck(::x10aux::nullCheck(this__87801)->FMGL(data))->x10::lang::Rail< x10_byte >::__apply(
                           idx__87800);
            ret__87802;
        }))
        ;
        
        //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        ::x10aux::nullCheck(this->FMGL(putback))->x10::util::GrowableRail<x10_byte>::removeLast();
        
        //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        ::x10aux::nullCheck(r)->x10::lang::Rail< x10_byte >::__set(
          ((x10_long)(read)), p);
        
        //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
        read = ((read) + (((x10_int)1)));
    }
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    if (((read) < (len))) {
        ::x10::io::FilterReader::read(r, ((x10_long)(((off) + (read)))),
                                      ((x10_long)(((len) - (read)))));
    }
    
}

//#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
void x10::io::PutbackReader::putback(x10_byte p) {
    
    //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
    ::x10aux::nullCheck(this->FMGL(putback))->x10::util::GrowableRail<x10_byte>::add(
      p);
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/io/PutbackReader.x10"
::x10::io::PutbackReader* x10::io::PutbackReader::x10__io__PutbackReader____this__x10__io__PutbackReader(
  ) {
    return this;
    
}
void x10::io::PutbackReader::__fieldInitializers_x10_io_PutbackReader(
  ) {
 
}
const ::x10aux::serialization_id_t x10::io::PutbackReader::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::io::PutbackReader::_deserializer);

void x10::io::PutbackReader::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::io::FilterReader::_serialize_body(buf);
    buf.write(this->FMGL(putback));
    
}

::x10::lang::Reference* ::x10::io::PutbackReader::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::io::PutbackReader* this_ = new (::x10aux::alloc_z< ::x10::io::PutbackReader>()) ::x10::io::PutbackReader();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::io::PutbackReader::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::io::FilterReader::_deserialize_body(buf);
    FMGL(putback) = buf.read< ::x10::util::GrowableRail<x10_byte>*>();
}

::x10aux::RuntimeType x10::io::PutbackReader::rtt;
void x10::io::PutbackReader::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::io::FilterReader>()};
    rtt.initStageTwo("x10.io.PutbackReader",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

/* END of PutbackReader */
/*************************************************/
