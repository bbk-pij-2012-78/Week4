Converter conv = new Converter();

println(conv.binary2decimal('1010'));
println(conv.decimal2binary(2));


class Converter {

    Double binary2decimal(String str) {
        int x = 0;
        int pwr = str.length() - 1;
        Double tot = 0;
        
        while (x < str.length()) {
            println(str.charAt(x));
            if (str.charAt(x) == '1') {
                tot += 1 * (2**pwr);
            }
            x++;
            pwr--;
        }
        
        return tot;
    }
    
    String decimal2binary(int i) {
        double a = 
        return (123/2).remainder();
    }

}