public class GradualCastDemo {
    public static void main(String[] args) {

        byte x, z;
        int y;

        x = 5;
        y = x * x; // Всё правильно, результат операции
        // Имеет тип int
        z = (byte) (x * x); // Чтобы записать результат
        // В переменную типо byte
        // Требуется явное преобразование
        // Типо результата

    } // main(String[]) method

} // GradualCastDemo class

