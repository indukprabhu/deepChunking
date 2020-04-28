/*************************************************/
/* START of MatBuilder */
#include <x10/regionarray/MatBuilder.h>

#include <x10/lang/Int.h>
#include <x10/util/ArrayList.h>
#include <x10/regionarray/Row.h>
#include <x10/lang/Long.h>
#include <x10/lang/Boolean.h>
#include <x10/lang/Fun_0_1.h>
#include <x10/regionarray/VarRow.h>
#include <x10/compiler/Synthetic.h>

//#line 18 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"

//#line 19 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"

//#line 21 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::_constructor(x10_int cols) {
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    ::x10::regionarray::MatBuilder* this__112816 = this;
    
    //#line 22 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    this->FMGL(cols) = cols;
    
    //#line 23 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    this->FMGL(mat) = (__extension__ ({
        ::x10::util::ArrayList< ::x10::regionarray::Row*>* alloc__112586 =
           (new (::x10aux::alloc_z< ::x10::util::ArrayList< ::x10::regionarray::Row*> >()) ::x10::util::ArrayList< ::x10::regionarray::Row*>());
        (alloc__112586)->::x10::util::ArrayList< ::x10::regionarray::Row*>::_constructor();
        alloc__112586;
    }))
    ;
}
::x10::regionarray::MatBuilder* x10::regionarray::MatBuilder::_make(x10_int cols)
{
    ::x10::regionarray::MatBuilder* this_ = new (::x10aux::alloc_z< ::x10::regionarray::MatBuilder>()) ::x10::regionarray::MatBuilder();
    this_->_constructor(cols);
    return this_;
}



//#line 26 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::_constructor(x10_int rows, x10_int cols) {
    
    //#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    ::x10::regionarray::MatBuilder* this__112817 = this;
    
    //#line 27 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    this->FMGL(cols) = cols;
    
    //#line 28 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    ::x10::util::ArrayList< ::x10::regionarray::Row*>* m =  (new (::x10aux::alloc_z< ::x10::util::ArrayList< ::x10::regionarray::Row*> >()) ::x10::util::ArrayList< ::x10::regionarray::Row*>());
    (m)->::x10::util::ArrayList< ::x10::regionarray::Row*>::_constructor(
      ((x10_long)(rows)));
    
    //#line 29 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    this->FMGL(mat) = m;
    
    //#line 30 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    ::x10::regionarray::MatBuilder::need(rows, m, cols);
}
::x10::regionarray::MatBuilder* x10::regionarray::MatBuilder::_make(
  x10_int rows, x10_int cols) {
    ::x10::regionarray::MatBuilder* this_ = new (::x10aux::alloc_z< ::x10::regionarray::MatBuilder>()) ::x10::regionarray::MatBuilder();
    this_->_constructor(rows, cols);
    return this_;
}



//#line 33 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::add(::x10::regionarray::Row* row) {
    
    //#line 34 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    ::x10aux::nullCheck(this->FMGL(mat))->add(row);
}

//#line 37 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::add(::x10::lang::Fun_0_1<x10_int, x10_int>* a) {
    
    //#line 38 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    ::x10aux::nullCheck(this->FMGL(mat))->add(reinterpret_cast< ::x10::regionarray::Row*>((__extension__ ({
                                                  ::x10::regionarray::VarRow* alloc__112587 =
                                                     (new (::x10aux::alloc_z< ::x10::regionarray::VarRow>()) ::x10::regionarray::VarRow());
                                                  (alloc__112587)->::x10::regionarray::VarRow::_constructor(
                                                    this->FMGL(cols),
                                                    a);
                                                  alloc__112587;
                                              }))
                                              ));
}

//#line 41 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
x10_int x10::regionarray::MatBuilder::__apply(x10_int i, x10_int j) {
    return ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(mat))->__apply(
                                 ((x10_long)(i))))->__apply(
             j);
    
}

//#line 43 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::__set(x10_int i, x10_int j,
                                         x10_int v) {
    
    //#line 44 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    this->need(((i) + (((x10_int)1))));
    
    //#line 45 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(mat))->__apply(
                          ((x10_long)(i))))->__set(j, v);
}

//#line 48 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::setDiagonal(x10_int i,
                                               x10_int j,
                                               x10_int n,
                                               ::x10::lang::Fun_0_1<x10_int, x10_int>* v) {
    
    //#line 49 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    this->need(((i) + (n)));
    
    //#line 50 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    {
        x10_int k;
        for (k = ((x10_int)0); ((k) < (n)); k = ((k) + (((x10_int)1))))
        {
            
            //#line 51 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(mat))->__apply(
                                  ((x10_long)(((i) + (k))))))->__set(
              ((j) + (k)), ::x10::lang::Fun_0_1<x10_int, x10_int>::__apply(::x10aux::nullCheck(v), 
                k));
        }
    }
    
}

//#line 54 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::setColumn(x10_int i, x10_int j,
                                             x10_int n, ::x10::lang::Fun_0_1<x10_int, x10_int>* v) {
    
    //#line 55 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    this->need(((i) + (n)));
    
    //#line 56 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    {
        x10_int k;
        for (k = ((x10_int)0); ((k) < (n)); k = ((k) + (((x10_int)1))))
        {
            
            //#line 57 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(mat))->__apply(
                                  ((x10_long)(((i) + (k))))))->__set(
              j, ::x10::lang::Fun_0_1<x10_int, x10_int>::__apply(::x10aux::nullCheck(v), 
                k));
        }
    }
    
}

//#line 60 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::setRow(x10_int i, x10_int j,
                                          x10_int n, ::x10::lang::Fun_0_1<x10_int, x10_int>* v) {
    
    //#line 61 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    this->need(((i) + (((x10_int)1))));
    
    //#line 62 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    {
        x10_int k;
        for (k = ((x10_int)0); ((k) < (n)); k = ((k) + (((x10_int)1))))
        {
            
            //#line 63 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
            ::x10aux::nullCheck(::x10aux::nullCheck(this->FMGL(mat))->__apply(
                                  ((x10_long)(i))))->__set(
              ((j) + (k)), ::x10::lang::Fun_0_1<x10_int, x10_int>::__apply(::x10aux::nullCheck(v), 
                k));
        }
    }
    
}

//#line 66 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::need(x10_int n) {
    ::x10::regionarray::MatBuilder::need(n, this->FMGL(mat),
                                         this->FMGL(cols));
}

//#line 67 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
void x10::regionarray::MatBuilder::need(x10_int n, ::x10::util::ArrayList< ::x10::regionarray::Row*>* mat,
                                        x10_int cols) {
    
    //#line 68 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
    while (((::x10aux::nullCheck(mat)->size()) < (((x10_long)(n)))))
    {
        
        //#line 69 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
        ::x10aux::nullCheck(mat)->add(reinterpret_cast< ::x10::regionarray::Row*>((__extension__ ({
                                          ::x10::regionarray::VarRow* alloc__112588 =
                                             (new (::x10aux::alloc_z< ::x10::regionarray::VarRow>()) ::x10::regionarray::VarRow());
                                          (alloc__112588)->::x10::regionarray::VarRow::_constructor(
                                            cols);
                                          alloc__112588;
                                      }))
                                      ));
    }
    
}

//#line 16 "/home/induk/workspace/x10-2.4.3-src/x10.runtime/src-x10/x10/regionarray/MatBuilder.x10"
::x10::regionarray::MatBuilder* x10::regionarray::MatBuilder::x10__regionarray__MatBuilder____this__x10__regionarray__MatBuilder(
  ) {
    return this;
    
}
void x10::regionarray::MatBuilder::__fieldInitializers_x10_regionarray_MatBuilder(
  ) {
 
}
const ::x10aux::serialization_id_t x10::regionarray::MatBuilder::_serialization_id = 
    ::x10aux::DeserializationDispatcher::addDeserializer(::x10::regionarray::MatBuilder::_deserializer);

void x10::regionarray::MatBuilder::_serialize_body(::x10aux::serialization_buffer& buf) {
    buf.write(this->FMGL(mat));
    buf.write(this->FMGL(cols));
    
}

::x10::lang::Reference* ::x10::regionarray::MatBuilder::_deserializer(::x10aux::deserialization_buffer& buf) {
    ::x10::regionarray::MatBuilder* this_ = new (::x10aux::alloc_z< ::x10::regionarray::MatBuilder>()) ::x10::regionarray::MatBuilder();
    buf.record_reference(this_);
    this_->_deserialize_body(buf);
    return this_;
}

void x10::regionarray::MatBuilder::_deserialize_body(::x10aux::deserialization_buffer& buf) {
    FMGL(mat) = buf.read< ::x10::util::ArrayList< ::x10::regionarray::Row*>*>();
    FMGL(cols) = buf.read<x10_int>();
}

::x10aux::RuntimeType x10::regionarray::MatBuilder::rtt;
void x10::regionarray::MatBuilder::_initRTT() {
    if (rtt.initStageOne(&rtt)) return;
    const ::x10aux::RuntimeType** parents = NULL; 
    rtt.initStageTwo("x10.regionarray.MatBuilder",::x10aux::RuntimeType::class_kind, 0, parents, 0, NULL, NULL);
}

/* END of MatBuilder */
/*************************************************/
