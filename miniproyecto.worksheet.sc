
// Regla de Simpson 1/3 Compuesta
def integracion(a: Int , b:Int, n:Int ,f:Double=> Double)= {
    val h = (b-a)/n
    if (n % 2 == 0){
        a+b
    }
    else
        printf("n debe ser un numero par")
    }
// Regla  de Simpson 1/3 Extendida
def integracion2(a: Int , b:Int, f:Double=> Double)= {
    val n = 2*(b-a)
    val h= (b-a)/n

    
    }
//Funciones
val funcion1=(x:Double) => -math.pow(x,2)+(8*x)-12
val funcion2=(x:Double) => 3*math.pow(x,2)
val funcion3=(x:Double) => x + (2*math.pow(x,2))-math.pow(x,3)+ (5*math.pow(x,4))
val funcion4=(x:Double) => ((2*x)+1)/(math.pow(x,2)+x)
val funcion5=(x:Double) => math.exp(x)
val funcion6=(x:Double) => 1 / math.sqrt(x-1)
val funcion7=(x:Double)=> 1/(1+math.pow(x,2))
//
integracion(3,5,2,funcion1)