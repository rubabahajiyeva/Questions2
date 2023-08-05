package com.rubabe.wellness.text


object SingletonPattern {
    fun use(){
        println("It is use to write")
    }
}

//named Singletonlar da var
class Singleton{
    companion object URL{

    }
}

/*
Singleton  classin yalniz bir instance olmasi ucun istifade olunur
her yerde classin eyni instancein istifade etmeliyikse Singleton istifade edirik.
Object keywordu birbasa Singletonu ifade edir. Singleton classi declare etmeye istifade olunur. bir instance olmasi appi performaisni yukseldir cunki ferqli obyektler arasinda ziddiyetler olmur.

amma testi haizlamaga mane olur beleki bir instance olur o da qlobal olduguna gore testleri bir birinden ayirmaq rahat olmur
*/