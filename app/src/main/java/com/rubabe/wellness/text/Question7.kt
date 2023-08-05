package com.rubabe.wellness.text

class Question7 {
    companion object {
        const val STATIC_VARIABLE = "http//"
    }
}


fun main(){
    println(Question7.STATIC_VARIABLE)
}
//static memberleri yartamaq ucun companion object keywordunden istifade olunur.
//static variablelar companion object blockunun daxilinde mueyyen olunur.
// The companion object blocku singleton object kimidir.


/*companion object- classin static memberlerini ve ya propoertilerini təyin etmək üçün istifadə olunur.
Bu, classin instancelarina deyil, classin özünə aid olan proportileri ve functionlari yaratmağa imkan verir.
Bu proportilere ve functionlara class adından istifadə etməklə daxil olunur.
Əgər classin bütün instancelari arasında paylaşılan proportiler varsa, onları componion objectde müəyyən etmek olar. Companion object bloku class load olunduqda initialize olunur.*/