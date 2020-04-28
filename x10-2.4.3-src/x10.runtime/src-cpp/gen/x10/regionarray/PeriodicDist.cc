/*************************************************/
/* START of PeriodicDist */
#include <x10/regionarray/PeriodicDist.h>

#include <x10/regionarray/Dist.h>
#include <x10/lang/Long.h>
#include <x10/lang/Rail.h>
#include <x10/regionarray/Region.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/lang/UnsupportedOperationException.h>
#include <x10/compiler/Inline.h>
#include <x10/lang/PlaceGroup.h>
#include <x10/lang/Iterable.h>
#include <x10/lang/Place.h>
#include <x10/lang/Point.h>
#include <x10/compiler/CompilerFlags.h>
#include <x10/lang/String.h>
#include <x10/compiler/Synthetic.h>
#ifndef X10_REGIONARRAY_PERIODICDIST__CLOSURE__1_CLOSURE
#define X10_REGIONARRAY_PERIODICDIST__CLOSURE__1_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PeriodicDist__closure__1 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PeriodicDist__closure__1> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ::x10aux::nullCheck(reg)->min(i);
        
    }
    
    // captured environment
    ::x10::regionarray::Region* reg;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->reg);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PeriodicDist__closure__1* storage = ::x10aux::alloc_z<x10_regionarray_PeriodicDist__closure__1>();
        buf.record_reference(storage);
        ::x10::regionarray::Region* that_reg = buf.read< ::x10::regionarray::Region*>();
        x10_regionarray_PeriodicDist__closure__1* this_ = new (storage) x10_regionarray_PeriodicDist__closure__1(that_reg);
        return this_;
    }
    
    x10_regionarray_PeriodicDist__closure__1(::x10::regionarray::Region* reg) : reg(reg) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10:53";
    }

};

#endif // X10_REGIONARRAY_PERIODICDIST__CLOSURE__1_CLOSURE
#ifndef X10_REGIONARRAY_PERIODICDIST__CLOSURE__2_CLOSURE
#define X10_REGIONARRAY_PERIODICDIST__CLOSURE__2_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PeriodicDist__closure__2 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PeriodicDist__closure__2> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        return ((((::x10aux::nullCheck(reg)->max(i)) - (tmpMin->x10::lang::Rail< x10_long >::__apply(
                                                          i)))) + (((x10_long)1ll)));
        
    }
    
    // captured environment
    ::x10::regionarray::Region* reg;
    ::x10::lang::Rail< x10_long >* tmpMin;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->reg);
        buf.write(this->tmpMin);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PeriodicDist__closure__2* storage = ::x10aux::alloc_z<x10_regionarray_PeriodicDist__closure__2>();
        buf.record_reference(storage);
        ::x10::regionarray::Region* that_reg = buf.read< ::x10::regionarray::Region*>();
        ::x10::lang::Rail< x10_long >* that_tmpMin = buf.read< ::x10::lang::Rail< x10_long >*>();
        x10_regionarray_PeriodicDist__closure__2* this_ = new (storage) x10_regionarray_PeriodicDist__closure__2(that_reg, that_tmpMin);
        return this_;
    }
    
    x10_regionarray_PeriodicDist__closure__2(::x10::regionarray::Region* reg, ::x10::lang::Rail< x10_long >* tmpMin) : reg(reg), tmpMin(tmpMin) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10:55";
    }

};

#endif // X10_REGIONARRAY_PERIODICDIST__CLOSURE__2_CLOSURE
#ifndef X10_REGIONARRAY_PERIODICDIST__CLOSURE__3_CLOSURE
#define X10_REGIONARRAY_PERIODICDIST__CLOSURE__3_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PeriodicDist__closure__3 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PeriodicDist__closure__3> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        ::x10::regionarray::PeriodicDist* this__113784 = saved_this;
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        x10_long index__113785 = ::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                                   i);
        x10_long dim__113786 = i;
        x10_long ret__113787;
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        x10_long regionMin__113781 = ((x10_long)0ll);
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if (((::x10aux::nullCheck(::x10aux::nullCheck(this__113784)->FMGL(region))->FMGL(rank)) < (((x10_long)(((x10_int)5))))))
        {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113786, ((x10_long)0ll))))
            {
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin__113781 = ::x10aux::nullCheck(this__113784)->FMGL(min0);
            } else 
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113786, ((x10_long)1ll))))
            {
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin__113781 = ::x10aux::nullCheck(this__113784)->FMGL(min1);
            } else 
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113786, ((x10_long)2ll))))
            {
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin__113781 = ::x10aux::nullCheck(this__113784)->FMGL(min2);
            } else 
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113786, ((x10_long)3ll))))
            {
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin__113781 = ::x10aux::nullCheck(this__113784)->FMGL(min3);
            } else 
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (true) {
                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
            }
            
        } else {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionMin__113781 = ::x10aux::nullCheck(::x10aux::nullCheck(this__113784)->FMGL(min))->x10::lang::Rail< x10_long >::__apply(
                                  dim__113786);
        }
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        x10_long regionDelta__113782 = ((x10_long)0ll);
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if (((::x10aux::nullCheck(::x10aux::nullCheck(this__113784)->FMGL(region))->FMGL(rank)) < (((x10_long)(((x10_int)5))))))
        {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113786, ((x10_long)0ll))))
            {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta__113782 = ::x10aux::nullCheck(this__113784)->FMGL(delta0);
            } else 
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113786, ((x10_long)1ll))))
            {
                
                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta__113782 = ::x10aux::nullCheck(this__113784)->FMGL(delta1);
            } else 
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113786, ((x10_long)2ll))))
            {
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta__113782 = ::x10aux::nullCheck(this__113784)->FMGL(delta2);
            } else 
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113786, ((x10_long)3ll))))
            {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta__113782 = ::x10aux::nullCheck(this__113784)->FMGL(delta3);
            } else 
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (true) {
                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
            }
            
        } else {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionDelta__113782 = ::x10aux::nullCheck(::x10aux::nullCheck(this__113784)->FMGL(delta))->x10::lang::Rail< x10_long >::__apply(
                                    dim__113786);
        }
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        x10_long actualIndex__113783 = index__113785;
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (((actualIndex__113783) < (regionMin__113781)))
        {
            actualIndex__113783 = ((actualIndex__113783) + (regionDelta__113782));
        }
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (((actualIndex__113783) >= (((regionMin__113781) + (regionDelta__113782)))))
        {
            actualIndex__113783 = ((actualIndex__113783) - (regionDelta__113782));
        }
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        ret__113787 = actualIndex__113783;
        
        //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return ret__113787;
        
    }
    
    // captured environment
    ::x10::regionarray::PeriodicDist* saved_this;
    ::x10::lang::Point* pt;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->pt);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PeriodicDist__closure__3* storage = ::x10aux::alloc_z<x10_regionarray_PeriodicDist__closure__3>();
        buf.record_reference(storage);
        ::x10::regionarray::PeriodicDist* that_saved_this = buf.read< ::x10::regionarray::PeriodicDist*>();
        ::x10::lang::Point* that_pt = buf.read< ::x10::lang::Point*>();
        x10_regionarray_PeriodicDist__closure__3* this_ = new (storage) x10_regionarray_PeriodicDist__closure__3(that_saved_this, that_pt);
        return this_;
    }
    
    x10_regionarray_PeriodicDist__closure__3(::x10::regionarray::PeriodicDist* saved_this, ::x10::lang::Point* pt) : saved_this(saved_this), pt(pt) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10:135";
    }

};

#endif // X10_REGIONARRAY_PERIODICDIST__CLOSURE__3_CLOSURE
#ifndef X10_REGIONARRAY_PERIODICDIST__CLOSURE__4_CLOSURE
#define X10_REGIONARRAY_PERIODICDIST__CLOSURE__4_CLOSURE
#include <x10/lang/Closure.h>
#include <x10/lang/Fun_0_1.h>
class x10_regionarray_PeriodicDist__closure__4 : public ::x10::lang::Closure {
    public:
    
    static ::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PeriodicDist__closure__4> _itable;
    static ::x10aux::itable_entry _itables[2];
    
    virtual ::x10aux::itable_entry* _getITables() { return _itables; }
    
    // closure body
    x10_long __apply(x10_long i) {
        ::x10::regionarray::PeriodicDist* this__113791 = saved_this;
        
        //#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        x10_long index__113792 = ::x10aux::nullCheck(pt)->x10::lang::Point::__apply(
                                   i);
        x10_long dim__113793 = i;
        x10_long ret__113794;
        
        //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        x10_long regionMin__113788 = ((x10_long)0ll);
        
        //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if (((::x10aux::nullCheck(::x10aux::nullCheck(this__113791)->FMGL(region))->FMGL(rank)) < (((x10_long)(((x10_int)5))))))
        {
            
            //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113793, ((x10_long)0ll))))
            {
                
                //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin__113788 = ::x10aux::nullCheck(this__113791)->FMGL(min0);
            } else 
            //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113793, ((x10_long)1ll))))
            {
                
                //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin__113788 = ::x10aux::nullCheck(this__113791)->FMGL(min1);
            } else 
            //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113793, ((x10_long)2ll))))
            {
                
                //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin__113788 = ::x10aux::nullCheck(this__113791)->FMGL(min2);
            } else 
            //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113793, ((x10_long)3ll))))
            {
                
                //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionMin__113788 = ::x10aux::nullCheck(this__113791)->FMGL(min3);
            } else 
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (true) {
                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
            }
            
        } else {
            
            //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionMin__113788 = ::x10aux::nullCheck(::x10aux::nullCheck(this__113791)->FMGL(min))->x10::lang::Rail< x10_long >::__apply(
                                  dim__113793);
        }
        
        //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        x10_long regionDelta__113789 = ((x10_long)0ll);
        
        //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if (((::x10aux::nullCheck(::x10aux::nullCheck(this__113791)->FMGL(region))->FMGL(rank)) < (((x10_long)(((x10_int)5))))))
        {
            
            //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113793, ((x10_long)0ll))))
            {
                
                //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta__113789 = ::x10aux::nullCheck(this__113791)->FMGL(delta0);
            } else 
            //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113793, ((x10_long)1ll))))
            {
                
                //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta__113789 = ::x10aux::nullCheck(this__113791)->FMGL(delta1);
            } else 
            //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113793, ((x10_long)2ll))))
            {
                
                //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta__113789 = ::x10aux::nullCheck(this__113791)->FMGL(delta2);
            } else 
            //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if ((::x10aux::struct_equals(dim__113793, ((x10_long)3ll))))
            {
                
                //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
                regionDelta__113789 = ::x10aux::nullCheck(this__113791)->FMGL(delta3);
            } else 
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            if (true) {
                ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
            }
            
        } else {
            
            //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionDelta__113789 = ::x10aux::nullCheck(::x10aux::nullCheck(this__113791)->FMGL(delta))->x10::lang::Rail< x10_long >::__apply(
                                    dim__113793);
        }
        
        //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        x10_long actualIndex__113790 = index__113792;
        
        //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (((actualIndex__113790) < (regionMin__113788)))
        {
            actualIndex__113790 = ((actualIndex__113790) + (regionDelta__113789));
        }
        
        //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        while (((actualIndex__113790) >= (((regionMin__113788) + (regionDelta__113789)))))
        {
            actualIndex__113790 = ((actualIndex__113790) - (regionDelta__113789));
        }
        
        //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        ret__113794 = actualIndex__113790;
        
        //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        return ret__113794;
        
    }
    
    // captured environment
    ::x10::regionarray::PeriodicDist* saved_this;
    ::x10::lang::Point* pt;
    
    ::x10aux::serialization_id_t _get_serialization_id() {
        return _serialization_id;
    }
    
    void _serialize_body(::x10aux::serialization_buffer &buf) {
        buf.write(this->saved_this);
        buf.write(this->pt);
    }
    
    static x10::lang::Reference* _deserialize(::x10aux::deserialization_buffer &buf) {
        x10_regionarray_PeriodicDist__closure__4* storage = ::x10aux::alloc_z<x10_regionarray_PeriodicDist__closure__4>();
        buf.record_reference(storage);
        ::x10::regionarray::PeriodicDist* that_saved_this = buf.read< ::x10::regionarray::PeriodicDist*>();
        ::x10::lang::Point* that_pt = buf.read< ::x10::lang::Point*>();
        x10_regionarray_PeriodicDist__closure__4* this_ = new (storage) x10_regionarray_PeriodicDist__closure__4(that_saved_this, that_pt);
        return this_;
    }
    
    x10_regionarray_PeriodicDist__closure__4(::x10::regionarray::PeriodicDist* saved_this, ::x10::lang::Point* pt) : saved_this(saved_this), pt(pt) { }
    
    static const ::x10aux::serialization_id_t _serialization_id;
    
    static const ::x10aux::RuntimeType* getRTT() { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    virtual const ::x10aux::RuntimeType *_type() const { return ::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >(); }
    
    const char* toNativeString() {
        return "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10:182";
    }

};

#endif // X10_REGIONARRAY_PERIODICDIST__CLOSURE__4_CLOSURE
::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place>::itable< ::x10::regionarray::PeriodicDist >  x10::regionarray::PeriodicDist::_itable_0(&::x10::regionarray::Dist::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::PeriodicDist::__apply, &x10::regionarray::PeriodicDist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Any::itable< ::x10::regionarray::PeriodicDist >  x10::regionarray::PeriodicDist::_itable_1(&::x10::regionarray::Dist::equals, &::x10::lang::X10Class::hashCode, &x10::regionarray::PeriodicDist::toString, &::x10::lang::X10Class::typeName);
::x10::lang::Iterable< ::x10::lang::Point*>::itable< ::x10::regionarray::PeriodicDist >  x10::regionarray::PeriodicDist::_itable_2(&::x10::regionarray::Dist::equals, &::x10::lang::X10Class::hashCode, &::x10::regionarray::Dist::iterator, &x10::regionarray::PeriodicDist::toString, &::x10::lang::X10Class::typeName);
::x10aux::itable_entry x10::regionarray::PeriodicDist::_itables[4] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1< ::x10::lang::Point*, ::x10::lang::Place> >, &_itable_0), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Any>, &_itable_1), ::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Iterable< ::x10::lang::Point*> >, &_itable_2), ::x10aux::itable_entry(NULL, (void*)"::x10::regionarray::PeriodicDist")};

//#line 24 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 32 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 35 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 36 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"

//#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
void x10::regionarray::PeriodicDist::_constructor(::x10::regionarray::Dist* base) {
    
    //#line 39 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    ::x10::regionarray::Dist* this__113777 = this;
    
    //#line 659 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10::regionarray::Region* region__113778 = ::x10aux::nullCheck(base)->FMGL(region);
    
    //#line 660 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/Dist.x10"
    ::x10aux::nullCheck(this__113777)->FMGL(region) = region__113778;
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    ::x10::regionarray::PeriodicDist* this__113776 = this;
    
    //#line 40 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    this->FMGL(baseDist) = base;
    
    //#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    ::x10::regionarray::Region* reg = ::x10aux::nullCheck(base)->FMGL(region);
    
    //#line 42 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    if (::x10aux::nullCheck(reg)->isEmpty()) {
        
        //#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        this->FMGL(min0) = this->FMGL(min1) = this->FMGL(min2) = this->FMGL(min3) =
          ((x10_long)0ll);
        
        //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        this->FMGL(delta0) = this->FMGL(delta1) = this->FMGL(delta2) =
          this->FMGL(delta3) = ((x10_long)0ll);
        
        //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((((__extension__ ({
                ::x10::regionarray::Dist* this__113737 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__113737)->FMGL(region))->FMGL(rank);
            }))
            ) > (((x10_long)4ll)))) {
            
            //#line 46 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min) = ::x10::lang::Rail< x10_long >::_make((__extension__ ({
                                                                       ::x10::regionarray::Dist* this__113738 =
                                                                         reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                                                       ::x10aux::nullCheck(::x10aux::nullCheck(this__113738)->FMGL(region))->FMGL(rank);
                                                                   }))
                                                                   );
            
            //#line 47 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(delta) = ::x10::lang::Rail< x10_long >::_make((__extension__ ({
                                                                         ::x10::regionarray::Dist* this__113739 =
                                                                           reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__113739)->FMGL(region))->FMGL(rank);
                                                                     }))
                                                                     );
        } else {
            
            //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min) = this->FMGL(delta) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        
    } else {
        
        //#line 52 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((((__extension__ ({
                ::x10::regionarray::Dist* this__113740 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__113740)->FMGL(region))->FMGL(rank);
            }))
            ) > (((x10_long)4ll)))) {
            
            //#line 53 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            ::x10::lang::Rail< x10_long >* tmpMin = ::x10::lang::Rail< x10_long >::_make((__extension__ ({
                                                                                             ::x10::regionarray::Dist* this__113741 =
                                                                                               reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                                                                             ::x10aux::nullCheck(::x10aux::nullCheck(this__113741)->FMGL(region))->FMGL(rank);
                                                                                         }))
                                                                                         ,
                                                                                         reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_PeriodicDist__closure__1)))x10_regionarray_PeriodicDist__closure__1(reg))));
            
            //#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min) = tmpMin;
            
            //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(delta) = ::x10::lang::Rail< x10_long >::_make((__extension__ ({
                                                                         ::x10::regionarray::Dist* this__113742 =
                                                                           reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__113742)->FMGL(region))->FMGL(rank);
                                                                     }))
                                                                     ,
                                                                     reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_PeriodicDist__closure__2)))x10_regionarray_PeriodicDist__closure__2(reg, tmpMin))));
        } else {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
            
            //#line 58 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(delta) = (::x10aux::class_cast_unchecked< ::x10::lang::Rail< x10_long >*>(reinterpret_cast< ::x10::lang::NullType*>(X10_NULL)));
        }
        
        //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        this->FMGL(min0) = ::x10aux::nullCheck(reg)->min(
                             ((x10_long)(((x10_int)0))));
        
        //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        this->FMGL(delta0) = ((((::x10aux::nullCheck(reg)->max(
                                   ((x10_long)(((x10_int)0))))) - (this->FMGL(min0)))) + (((x10_long)1ll)));
        
        //#line 64 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((((__extension__ ({
                ::x10::regionarray::Dist* this__113743 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__113743)->FMGL(region))->FMGL(rank);
            }))
            ) > (((x10_long)1ll)))) {
            
            //#line 65 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min1) = ::x10aux::nullCheck(reg)->min(
                                 ((x10_long)(((x10_int)1))));
            
            //#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(delta1) = ((((::x10aux::nullCheck(reg)->max(
                                       ((x10_long)(((x10_int)1))))) - (this->FMGL(min1)))) + (((x10_long)1ll)));
        } else {
            
            //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min1) = this->FMGL(delta1) = ((x10_long)0ll);
        }
        
        //#line 71 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((((__extension__ ({
                ::x10::regionarray::Dist* this__113744 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__113744)->FMGL(region))->FMGL(rank);
            }))
            ) > (((x10_long)2ll)))) {
            
            //#line 72 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min2) = ::x10aux::nullCheck(reg)->min(
                                 ((x10_long)(((x10_int)2))));
            
            //#line 73 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(delta2) = ((((::x10aux::nullCheck(reg)->max(
                                       ((x10_long)(((x10_int)2))))) - (this->FMGL(min2)))) + (((x10_long)1ll)));
        } else {
            
            //#line 75 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min2) = this->FMGL(delta2) = ((x10_long)0ll);
        }
        
        //#line 78 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((((__extension__ ({
                ::x10::regionarray::Dist* this__113745 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
                ::x10aux::nullCheck(::x10aux::nullCheck(this__113745)->FMGL(region))->FMGL(rank);
            }))
            ) > (((x10_long)3ll)))) {
            
            //#line 79 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min3) = ::x10aux::nullCheck(reg)->min(
                                 ((x10_long)(((x10_int)3))));
            
            //#line 80 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(delta3) = ((((::x10aux::nullCheck(reg)->max(
                                       ((x10_long)(((x10_int)3))))) - (this->FMGL(min3)))) + (((x10_long)1ll)));
        } else {
            
            //#line 82 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            this->FMGL(min3) = this->FMGL(delta3) = ((x10_long)0ll);
        }
        
    }
    
}
::x10::regionarray::PeriodicDist* x10::regionarray::PeriodicDist::_make(
  ::x10::regionarray::Dist* base) {
    ::x10::regionarray::PeriodicDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PeriodicDist>()) ::x10::regionarray::PeriodicDist();
    this_->_constructor(base);
    return this_;
}



//#line 87 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
x10_long x10::regionarray::PeriodicDist::getPeriodicIndex(
  x10_long index, x10_long dim) {
    
    //#line 88 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long regionMin = ((x10_long)0ll);
    
    //#line 89 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    if ((((__extension__ ({
            ::x10::regionarray::Dist* this__113746 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
            ::x10aux::nullCheck(::x10aux::nullCheck(this__113746)->FMGL(region))->FMGL(rank);
        }))
        ) < (((x10_long)(((x10_int)5)))))) {
        
        //#line 90 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((::x10aux::struct_equals(dim, ((x10_long)0ll))))
        {
            
            //#line 91 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionMin = this->FMGL(min0);
        } else 
        //#line 92 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((::x10aux::struct_equals(dim, ((x10_long)1ll))))
        {
            
            //#line 93 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionMin = this->FMGL(min1);
        } else 
        //#line 94 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((::x10aux::struct_equals(dim, ((x10_long)2ll))))
        {
            
            //#line 95 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionMin = this->FMGL(min2);
        } else 
        //#line 96 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((::x10aux::struct_equals(dim, ((x10_long)3ll))))
        {
            
            //#line 97 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionMin = this->FMGL(min3);
        } else {
            
            //#line 99 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
        }
        
    } else {
        
        //#line 102 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        regionMin = ::x10aux::nullCheck(this->FMGL(min))->x10::lang::Rail< x10_long >::__apply(
                      dim);
    }
    
    //#line 104 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long regionDelta = ((x10_long)0ll);
    
    //#line 105 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    if ((((__extension__ ({
            ::x10::regionarray::Dist* this__113747 = reinterpret_cast< ::x10::regionarray::Dist*>(this);
            ::x10aux::nullCheck(::x10aux::nullCheck(this__113747)->FMGL(region))->FMGL(rank);
        }))
        ) < (((x10_long)(((x10_int)5)))))) {
        
        //#line 106 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((::x10aux::struct_equals(dim, ((x10_long)0ll))))
        {
            
            //#line 107 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionDelta = this->FMGL(delta0);
        } else 
        //#line 108 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((::x10aux::struct_equals(dim, ((x10_long)1ll))))
        {
            
            //#line 109 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionDelta = this->FMGL(delta1);
        } else 
        //#line 110 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((::x10aux::struct_equals(dim, ((x10_long)2ll))))
        {
            
            //#line 111 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionDelta = this->FMGL(delta2);
        } else 
        //#line 112 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        if ((::x10aux::struct_equals(dim, ((x10_long)3ll))))
        {
            
            //#line 113 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            regionDelta = this->FMGL(delta3);
        } else {
            
            //#line 115 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
            ::x10aux::throwException(::x10aux::nullCheck(::x10::lang::UnsupportedOperationException::_make()));
        }
        
    } else {
        
        //#line 118 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
        regionDelta = ::x10aux::nullCheck(this->FMGL(delta))->x10::lang::Rail< x10_long >::__apply(
                        dim);
    }
    
    //#line 120 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long actualIndex = index;
    
    //#line 121 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((actualIndex) < (regionMin))) {
        actualIndex = ((actualIndex) + (regionDelta));
    }
    
    //#line 122 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((actualIndex) >= (((regionMin) + (regionDelta)))))
    {
        actualIndex = ((actualIndex) - (regionDelta));
    }
    
    //#line 123 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return actualIndex;
    
}

//#line 126 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::lang::PlaceGroup* x10::regionarray::PeriodicDist::places(
  ) {
    return ::x10aux::nullCheck(this->FMGL(baseDist))->places();
    
}

//#line 127 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
x10_long x10::regionarray::PeriodicDist::numPlaces() {
    return ::x10aux::nullCheck(this->FMGL(baseDist))->numPlaces();
    
}

//#line 128 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::lang::Iterable< ::x10::regionarray::Region*>* x10::regionarray::PeriodicDist::regions(
  ) {
    return ::x10aux::nullCheck(this->FMGL(baseDist))->regions();
    
}

//#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::regionarray::Region* x10::regionarray::PeriodicDist::get(
  ::x10::lang::Place p) {
    return ::x10aux::nullCheck(this->FMGL(baseDist))->get(
             p);
    
}

//#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::regionarray::Region* x10::regionarray::PeriodicDist::__apply(
  ::x10::lang::Place p) {
    ::x10::regionarray::PeriodicDist* this__113779 = this;
    
    //#line 129 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    ::x10::lang::Place p__113780 = p;
    
    //#line 132 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(::x10aux::nullCheck(this__113779)->FMGL(baseDist))->get(
             p__113780);
    
}

//#line 134 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::lang::Place x10::regionarray::PeriodicDist::__apply(
  ::x10::lang::Point* pt) {
    
    //#line 135 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    ::x10::lang::Point* actualPt = ::x10::lang::Point::make(
                                     (__extension__ ({
                                         ::x10::regionarray::Dist* this__113750 =
                                           reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__113750)->FMGL(region))->FMGL(rank);
                                     }))
                                     , reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_PeriodicDist__closure__3)))x10_regionarray_PeriodicDist__closure__3(this, pt))));
    
    //#line 136 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->__apply(
             actualPt);
    
}

//#line 138 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::lang::Place x10::regionarray::PeriodicDist::__apply(
  x10_long i0) {
    
    //#line 139 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a0 = i0;
    
    //#line 140 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) < (this->FMGL(min0)))) {
        a0 = ((a0) + (this->FMGL(delta0)));
    }
    
    //#line 141 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) >= (((this->FMGL(min0)) + (this->FMGL(delta0))))))
    {
        a0 = ((a0) - (this->FMGL(delta0)));
    }
    
    //#line 142 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->__apply(
             a0);
    
}

//#line 144 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::lang::Place x10::regionarray::PeriodicDist::__apply(
  x10_long i0, x10_long i1) {
    
    //#line 145 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a0 = i0;
    
    //#line 146 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) < (this->FMGL(min0)))) {
        a0 = ((a0) + (this->FMGL(delta0)));
    }
    
    //#line 147 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) >= (((this->FMGL(min0)) + (this->FMGL(delta0))))))
    {
        a0 = ((a0) - (this->FMGL(delta0)));
    }
    
    //#line 148 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a1 = i1;
    
    //#line 149 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) < (this->FMGL(min1)))) {
        a1 = ((a1) + (this->FMGL(delta1)));
    }
    
    //#line 150 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) >= (((this->FMGL(min1)) + (this->FMGL(delta1))))))
    {
        a1 = ((a1) - (this->FMGL(delta1)));
    }
    
    //#line 151 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->__apply(
             a0, a1);
    
}

//#line 153 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::lang::Place x10::regionarray::PeriodicDist::__apply(
  x10_long i0, x10_long i1, x10_long i2) {
    
    //#line 154 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a0 = i0;
    
    //#line 155 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) < (this->FMGL(min0)))) {
        a0 = ((a0) + (this->FMGL(delta0)));
    }
    
    //#line 156 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) >= (((this->FMGL(min0)) + (this->FMGL(delta0))))))
    {
        a0 = ((a0) - (this->FMGL(delta0)));
    }
    
    //#line 157 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a1 = i1;
    
    //#line 158 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) < (this->FMGL(min1)))) {
        a1 = ((a1) + (this->FMGL(delta1)));
    }
    
    //#line 159 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) >= (((this->FMGL(min1)) + (this->FMGL(delta1))))))
    {
        a1 = ((a1) - (this->FMGL(delta1)));
    }
    
    //#line 160 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a2 = i2;
    
    //#line 161 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a2) < (this->FMGL(min2)))) {
        a2 = ((a2) + (this->FMGL(delta2)));
    }
    
    //#line 162 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a2) >= (((this->FMGL(min2)) + (this->FMGL(delta2))))))
    {
        a2 = ((a2) - (this->FMGL(delta2)));
    }
    
    //#line 163 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->__apply(
             a0, a1, a2);
    
}

//#line 165 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::lang::Place x10::regionarray::PeriodicDist::__apply(
  x10_long i0, x10_long i1, x10_long i2, x10_long i3) {
    
    //#line 166 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a0 = i0;
    
    //#line 167 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) < (this->FMGL(min0)))) {
        a0 = ((a0) + (this->FMGL(delta0)));
    }
    
    //#line 168 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) >= (((this->FMGL(min0)) + (this->FMGL(delta0))))))
    {
        a0 = ((a0) - (this->FMGL(delta0)));
    }
    
    //#line 169 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a1 = i1;
    
    //#line 170 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) < (this->FMGL(min1)))) {
        a1 = ((a1) + (this->FMGL(delta1)));
    }
    
    //#line 171 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) >= (((this->FMGL(min1)) + (this->FMGL(delta1))))))
    {
        a1 = ((a1) - (this->FMGL(delta1)));
    }
    
    //#line 172 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a2 = i2;
    
    //#line 173 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a2) < (this->FMGL(min2)))) {
        a2 = ((a2) + (this->FMGL(delta2)));
    }
    
    //#line 174 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a2) >= (((this->FMGL(min2)) + (this->FMGL(delta2))))))
    {
        a2 = ((a2) - (this->FMGL(delta2)));
    }
    
    //#line 175 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a3 = i3;
    
    //#line 176 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a3) < (this->FMGL(min3)))) {
        a3 = ((a3) + (this->FMGL(delta3)));
    }
    
    //#line 177 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a3) >= (((this->FMGL(min3)) + (this->FMGL(delta3))))))
    {
        a3 = ((a3) - (this->FMGL(delta3)));
    }
    
    //#line 178 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->__apply(
             a0, a1, a2, a3);
    
}

//#line 181 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
x10_long x10::regionarray::PeriodicDist::offset(::x10::lang::Point* pt) {
    
    //#line 182 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    ::x10::lang::Point* actualPt = ::x10::lang::Point::make(
                                     (__extension__ ({
                                         ::x10::regionarray::Dist* this__113763 =
                                           reinterpret_cast< ::x10::regionarray::Dist*>(this);
                                         ::x10aux::nullCheck(::x10aux::nullCheck(this__113763)->FMGL(region))->FMGL(rank);
                                     }))
                                     , reinterpret_cast< ::x10::lang::Fun_0_1<x10_long, x10_long>*>((new (::x10aux::alloc< ::x10::lang::Fun_0_1<x10_long, x10_long> >(sizeof(x10_regionarray_PeriodicDist__closure__4)))x10_regionarray_PeriodicDist__closure__4(this, pt))));
    
    //#line 183 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->offset(
             actualPt);
    
}

//#line 185 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
x10_long x10::regionarray::PeriodicDist::offset(x10_long i0) {
    
    //#line 186 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a0 = i0;
    
    //#line 187 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) < (this->FMGL(min0)))) {
        a0 = ((a0) + (this->FMGL(delta0)));
    }
    
    //#line 188 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) >= (((this->FMGL(min0)) + (this->FMGL(delta0))))))
    {
        a0 = ((a0) - (this->FMGL(delta0)));
    }
    
    //#line 189 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->offset(
             a0);
    
}

//#line 191 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
x10_long x10::regionarray::PeriodicDist::offset(x10_long i0,
                                                x10_long i1) {
    
    //#line 192 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a0 = i0;
    
    //#line 193 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) < (this->FMGL(min0)))) {
        a0 = ((a0) + (this->FMGL(delta0)));
    }
    
    //#line 194 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) >= (((this->FMGL(min0)) + (this->FMGL(delta0))))))
    {
        a0 = ((a0) - (this->FMGL(delta0)));
    }
    
    //#line 195 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a1 = i1;
    
    //#line 196 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) < (this->FMGL(min1)))) {
        a1 = ((a1) + (this->FMGL(delta1)));
    }
    
    //#line 197 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) >= (((this->FMGL(min1)) + (this->FMGL(delta1))))))
    {
        a1 = ((a1) - (this->FMGL(delta1)));
    }
    
    //#line 198 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->offset(
             a0, a1);
    
}

//#line 200 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
x10_long x10::regionarray::PeriodicDist::offset(x10_long i0,
                                                x10_long i1,
                                                x10_long i2) {
    
    //#line 201 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a0 = i0;
    
    //#line 202 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) < (this->FMGL(min0)))) {
        a0 = ((a0) + (this->FMGL(delta0)));
    }
    
    //#line 203 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) >= (((this->FMGL(min0)) + (this->FMGL(delta0))))))
    {
        a0 = ((a0) - (this->FMGL(delta0)));
    }
    
    //#line 204 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a1 = i1;
    
    //#line 205 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) < (this->FMGL(min1)))) {
        a1 = ((a1) + (this->FMGL(delta1)));
    }
    
    //#line 206 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) >= (((this->FMGL(min1)) + (this->FMGL(delta1))))))
    {
        a1 = ((a1) - (this->FMGL(delta1)));
    }
    
    //#line 207 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a2 = i2;
    
    //#line 208 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a2) < (this->FMGL(min2)))) {
        a2 = ((a2) + (this->FMGL(delta2)));
    }
    
    //#line 209 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a2) >= (((this->FMGL(min2)) + (this->FMGL(delta2))))))
    {
        a2 = ((a2) - (this->FMGL(delta2)));
    }
    
    //#line 210 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->offset(
             a0, a1, a2);
    
}

//#line 212 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
x10_long x10::regionarray::PeriodicDist::offset(x10_long i0,
                                                x10_long i1,
                                                x10_long i2,
                                                x10_long i3) {
    
    //#line 213 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a0 = i0;
    
    //#line 214 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) < (this->FMGL(min0)))) {
        a0 = ((a0) + (this->FMGL(delta0)));
    }
    
    //#line 215 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a0) >= (((this->FMGL(min0)) + (this->FMGL(delta0))))))
    {
        a0 = ((a0) - (this->FMGL(delta0)));
    }
    
    //#line 216 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a1 = i1;
    
    //#line 217 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) < (this->FMGL(min1)))) {
        a1 = ((a1) + (this->FMGL(delta1)));
    }
    
    //#line 218 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a1) >= (((this->FMGL(min1)) + (this->FMGL(delta1))))))
    {
        a1 = ((a1) - (this->FMGL(delta1)));
    }
    
    //#line 219 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a2 = i2;
    
    //#line 220 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a2) < (this->FMGL(min2)))) {
        a2 = ((a2) + (this->FMGL(delta2)));
    }
    
    //#line 221 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a2) >= (((this->FMGL(min2)) + (this->FMGL(delta2))))))
    {
        a2 = ((a2) - (this->FMGL(delta2)));
    }
    
    //#line 222 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    x10_long a3 = i3;
    
    //#line 223 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a3) < (this->FMGL(min3)))) {
        a3 = ((a3) + (this->FMGL(delta3)));
    }
    
    //#line 224 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    while (((a3) >= (((this->FMGL(min3)) + (this->FMGL(delta3))))))
    {
        a3 = ((a3) - (this->FMGL(delta3)));
    }
    
    //#line 225 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10aux::nullCheck(this->FMGL(baseDist))->offset(
             a0, a1, a2, a3);
    
}

//#line 228 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
x10_long x10::regionarray::PeriodicDist::maxOffset() {
    return ::x10aux::nullCheck(this->FMGL(baseDist))->maxOffset();
    
}

//#line 229 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::regionarray::Dist* x10::regionarray::PeriodicDist::restriction(
  ::x10::regionarray::Region* r) {
    ::x10::regionarray::PeriodicDist* alloc__113795 =  (new (::x10aux::alloc_z< ::x10::regionarray::PeriodicDist>()) ::x10::regionarray::PeriodicDist());
    (alloc__113795)->::x10::regionarray::PeriodicDist::_constructor(
      ::x10aux::nullCheck(this->FMGL(baseDist))->restriction(
        r));
    return alloc__113795;
    
}

//#line 230 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::regionarray::Dist* x10::regionarray::PeriodicDist::restriction(
  ::x10::lang::Place p) {
    ::x10::regionarray::PeriodicDist* alloc__113796 =  (new (::x10aux::alloc_z< ::x10::regionarray::PeriodicDist>()) ::x10::regionarray::PeriodicDist());
    (alloc__113796)->::x10::regionarray::PeriodicDist::_constructor(
      ::x10aux::nullCheck(this->FMGL(baseDist))->restriction(
        p));
    return alloc__113796;
    
}

//#line 232 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::lang::String* x10::regionarray::PeriodicDist::toString(
  ) {
    
    //#line 233 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
    return ::x10::lang::String::__plus((__extension__ ({ static ::x10::lang::String* strLit__126805 = ::x10aux::makeStringLit("Periodic: "); strLit__126805; })), ::x10aux::nullCheck(this->FMGL(baseDist))->toString());
    
}

//#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/PeriodicDist.x10"
::x10::regionarray::PeriodicDist* x10::regionarray::PeriodicDist::x10__regionarray__PeriodicDist____this__x10__regionarray__PeriodicDist(
  ) {
    return this;
    
}
void x10::regionarray::PeriodicDist::__fieldInitializers_x10_regionarray_PeriodicDist(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::PeriodicDist::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::PeriodicDist::_deserializer);

void x10::regionarray::PeriodicDist::_serialize_body(::x10aux::serialization_buffer& buf) {
    ::x10::regionarray::Dist::_serialize_body(buf);
    buf.write(this->FMGL(baseDist));
    buf.write(this->FMGL(min));
    buf.write(this->FMGL(min0));
    buf.write(this->FMGL(min1));
    buf.write(this->FMGL(min2));
    buf.write(this->FMGL(min3));
    buf.write(this->FMGL(delta));
    buf.write(this->FMGL(delta0));
    buf.write(this->FMGL(delta1));
    buf.write(this->FMGL(delta2));
    buf.write(this->FMGL(delta3));
    
}

::x10::lang::Reference* ::x10::regionarray::PeriodicDist::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::PeriodicDist* this_ = new (::x10aux::alloc_z< ::x10::regionarray::PeriodicDist>()) ::x10::regionarray::PeriodicDist();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::PeriodicDist::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::Dist::_deserialize_body(buf);
    FMGL(baseDist) = buf.read< ::x10::regionarray::Dist*>();
    FMGL(min) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(min0) = buf.read<x10_long>();
    FMGL(min1) = buf.read<x10_long>();
    FMGL(min2) = buf.read<x10_long>();
    FMGL(min3) = buf.read<x10_long>();
    FMGL(delta) = buf.read< ::x10::lang::Rail< x10_long >*>();
    FMGL(delta0) = buf.read<x10_long>();
    FMGL(delta1) = buf.read<x10_long>();
    FMGL(delta2) = buf.read<x10_long>();
    FMGL(delta3) = buf.read<x10_long>();
}

::x10aux::RuntimeType x10::regionarray::PeriodicDist::rtt;
void x10::regionarray::PeriodicDist::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType* parents[1] = { ::x10aux::getRTT< ::x10::regionarray::Dist>()};
    rtt.initStageTwo("x10.regionarray.PeriodicDist",::x10aux::RuntimeType::class_kind, 1, parents, 0, NULL, NULL);
}

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PeriodicDist__closure__1>x10_regionarray_PeriodicDist__closure__1::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PeriodicDist__closure__1::__apply, &x10_regionarray_PeriodicDist__closure__1::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PeriodicDist__closure__1::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_PeriodicDist__closure__1::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PeriodicDist__closure__1::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PeriodicDist__closure__1::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PeriodicDist__closure__2>x10_regionarray_PeriodicDist__closure__2::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PeriodicDist__closure__2::__apply, &x10_regionarray_PeriodicDist__closure__2::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PeriodicDist__closure__2::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_PeriodicDist__closure__2::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PeriodicDist__closure__2::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PeriodicDist__closure__2::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PeriodicDist__closure__3>x10_regionarray_PeriodicDist__closure__3::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PeriodicDist__closure__3::__apply, &x10_regionarray_PeriodicDist__closure__3::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PeriodicDist__closure__3::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_PeriodicDist__closure__3::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PeriodicDist__closure__3::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PeriodicDist__closure__3::_deserialize);

::x10::lang::Fun_0_1<x10_long, x10_long>::itable<x10_regionarray_PeriodicDist__closure__4>x10_regionarray_PeriodicDist__closure__4::_itable(&::x10::lang::Reference::equals, &::x10::lang::Closure::hashCode, &x10_regionarray_PeriodicDist__closure__4::__apply, &x10_regionarray_PeriodicDist__closure__4::toString, &::x10::lang::Closure::typeName);
::x10aux::itable_entry x10_regionarray_PeriodicDist__closure__4::_itables[2] = {::x10aux::itable_entry(&::x10aux::getRTT< ::x10::lang::Fun_0_1<x10_long, x10_long> >, &x10_regionarray_PeriodicDist__closure__4::_itable),::x10aux::itable_entry(NULL, NULL)};

const ::x10aux::serialization_id_t x10_regionarray_PeriodicDist__closure__4::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(x10_regionarray_PeriodicDist__closure__4::_deserialize);

/* END of PeriodicDist */
/*************************************************/
