package org.example

class Beguda {

    private var nom:String = ""
    private var preu:Double = 0.0
    private var ensucrat:Boolean = false


    constructor(nom:String, preu: Double, ensucrat: Boolean){
        this.nom=nom
        this.preu=preu
        this.ensucrat=ensucrat
    }

    fun setNom(nom:String){
        this.nom=nom
    }
    fun getNom():String{
        return this.nom
    }
    fun setPreu(preu:Double){
        this.preu=preu
    }
    fun getPreu():Double{
        return this.preu
    }
    fun setEnsucrat(ensucrat:Boolean){
        this.ensucrat=ensucrat
    }
    fun getEnsucrat():Boolean{
        return this.ensucrat
    }

    override fun toString(): String {
        return  "Nom: $nom\n" +
                "Preu: $preu €\n"+
                "Ensucrat: $ensucrat\n"
    }


}