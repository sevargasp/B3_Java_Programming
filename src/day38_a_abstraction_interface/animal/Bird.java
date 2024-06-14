package day38_a_abstraction_interface.animal;

public abstract class Bird extends Animal{
    double beakSize;

    public abstract void useWings();



}
/*para asegurarme que implemente correctamente debo de usar el @override para saber si lo hice bien.
* si esta clase se llega a convertir en abstract, no necesitaria implementar los metodos de los papas, porque abstract permite inherit pero sin usar los metodos de los padres.
* NORMALMENTE YO NO NECESITO CREAR IMPLEMENTACION SI LOS DOS SON ABSTRACT, PORQUE NO PUEDO ALCANZAR METODO DESDE EL BIRD, PORQUE YO NO PUEDO CREAR UN OBJETO DESDE BIRD, ENTONCES POSIBLEMENTE PUEDO ALCANZARLO PERO SOLO POR PARROT.
* NO SIEMPRE QUE TENGA MI CLASE ABSTRACTA DEBO DE USAR TODOS LOS METODOS ABSTRACTOS, PUEDO TENER AQUI UNO SIN ABSTRACT. 50 MINS+CLASE
* SI MI CLASE ES ABSTRACTA NO DEBO DECLARAR EL METODO ABSTRACTO DEL PADRE. TENGO LA OPCION.
*
*
* */