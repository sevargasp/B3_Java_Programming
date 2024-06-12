package day31_custom_classes;

public class Carpet {

    double width;
    double length;
    boolean isPersian;
    double unitPrice;
    double totalPrice;

//una vez que yo llamo mi metodo en la parte de abajo, el default deja de existi.
    public Carpet (boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice) {
//        calculatePrice(); si dejas aqui esta variable, al final se imprime vacia porque antes de asignar los valores la estaba llamando y multiplicando por 0.
        isPersian = inputPersian;//lo de la derecha hace coincidir con las variables de arriba.
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        calculatePrice();

    }


    public void calculatePrice () {
        totalPrice = width * length * unitPrice;
        if (isPersian) {
            totalPrice += 200;
        }
    }


    @Override
    public String toString() {
        return "Carpet Info" +
                "\n\tWidth: " + width +
                "\n\tLength: " + length +
                "\n\tPersian: " + isPersian +
                "\n\tUnit Price: $" + unitPrice +
                "\n\tTotal Price: $" + totalPrice;
    }
}