class Persona (N:String){ //puedes omitir constructor
    //propiedades
    val nombre : String = "" // val porque el nobre no puede variar
    var edad : Int = 0
    var sexo : Boolean = true//T=M F=H
    var altura : Float = 0.0f 

    init{
        println("hola soy $N")//inserte codigo aqui
        this.nombre=N
    }
     fun registrar(){
        println("Registrando")
     }

    constructor(N:String, E:Int, S:Boolean):this(N){
        println("tu tienes $E años")
        this.nombre=N
        this.edad=E
        this.sexo=S
    }

     constructor(N:String, A:Float):this(N){
         println("Tu mides $A")
        this.nombre=N
        this.altura=A
     }

     class CA{} // clase aninada
     inner class CB{} // clase interna

}