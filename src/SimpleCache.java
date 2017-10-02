public class SimpleCache {
    int[] lista = new int[10];
    int[] summaLista = new int[10];

    public int calculate(int key) throws InterruptedException {
        Calculator calc = new Calculator();
        int result;

        if (lista[key] == 0){
            lista[key] = key;
            result = calc.doComplexCalculation(key);
            summaLista[key] = result;}
        else{
            System.out.println("Using cached data");
                result = summaLista[key];}

        return result;
    }
}
