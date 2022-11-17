
//Simpson 1/3
def integracion(a:Int, b:Int, f:(Double) => Double):Double = {(b-a)*(f(a)+ (4*f((a+b)/2.0))+ f(b))/6}
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
    val h: Double = (b-a) /n.toDouble
    val rangosImpares = (1 until n  by 2 ).map(i =>f(a + (i*h))).sum
    val rangosPares = (2 to n-2  by 2 ).map(j =>f(a + (j*h))).sum
    (h/3)* (f(a)+ (4*rangosImpares)+(2*rangosPares)+f(b))
    }

//Funciones
val funcion1=(x:Double) => -math.pow(x,2)+(8*x)-12
val funcion2=(x:Double) => 3*math.pow(x,2)
val funcion3=(x:Double) => x + (2*math.pow(x,2))-math.pow(x,3)+ (5*math.pow(x,4))
val funcion4=(x:Double) => ((2*x)+1)/(math.pow(x,2)+x)
val funcion5=(x:Double) => math.exp(x)
val funcion6=(x:Double) => 1 / math.sqrt(x-1)
val funcion7=(x:Double)=> 1/(1+math.pow(x,2))
//Evaluar Resultados
//Simpson 1/3
val x1= integracion(3,5,funcion1)
val x2=integracion(0,2,funcion2)
val x3= integracion(-1,1,funcion3)
val x4= integracion(1,2,funcion4)
val x5=integracion(0,1,funcion5)
val x6=integracion(2,3,funcion6)
val x7=integracion(0,1,funcion7)
//Simpson 1/3 Extendida
val x11= integracion2(3,5,funcion1)
val x22=integracion2(0,2,funcion2)
val x33= integracion2(-1,1,funcion3)
val x44= integracion2(1,2,funcion4)
val x55=integracion2(0,1,funcion5)
val x66=integracion2(2,3,funcion6)
val x77=integracion2(0,1,funcion7)
