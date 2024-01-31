package org.example

class Pasta {

    private var nom:String = ""
    private var calories:Int = 0
    private var pes:Int = 0
    private var preu:Double = 0.0


    constructor(nom: String,calories: Int,pes: Int,preu: Double){
        this.nom=nom
        this.calories=calories
        this.pes=pes
        this.preu=preu
    }

    fun setNom(nom:String){
        this.nom=nom
    }
    fun getNom():String{
        return this.nom
    }
    fun setCalories(calories:Int){
        this.calories=calories
    }
    fun getCalories():Int{
        return this.calories
    }
    fun setPes(pes:Int){
        this.pes=pes
    }
    fun getPes():Int{
        return this.pes
    }
    fun setPreu(preu:Double){
        this.preu=preu
    }
    fun getPreu():Double{
        return this.preu
    }


    override fun toString(): String {
        return  "Nom: $nom\n"+
                "Calories: $calories\n" +
                "Pes: $pes\n"+
                "Preu: $preu\n"
    }

}