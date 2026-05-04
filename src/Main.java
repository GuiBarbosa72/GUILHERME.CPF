void main(){}
    public static boolean isCPFValido(String cpf) {
        cpf = cpf.replaceAll("\\D", "");
        if (cpf.length() != 11) return false;
        if (cpf.matches("(\\d)\\1{10}")) return false;
        try {
            int soma = 0;
            for (int i = 0; i < 9; i++) {
                soma += (cpf.charAt(i) - '0') * (10 - i);
            }
            int digito1 = 11 - (soma % 11);
            if (digito1 >= 10) digito1 = 0;
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += (cpf.charAt(i) - '0') * (11 - i);
            }
            int digito2 = 11 - (soma % 11);
            if (digito2 >= 10) digito2 = 0;

            return digito1 == (cpf.charAt(9) - '0') &&
                    digito2 == (cpf.charAt(10) - '0');
        } catch (Exception e) {
            return false;
        }
    }
    public static void main(String[] args) {
        String cpf = "123.456.789-09";
        if (isCPFValido(cpf)) {
            System.out.println("CPF válido");
        } else {
            System.out.println("CPF inválido");
        }
    }