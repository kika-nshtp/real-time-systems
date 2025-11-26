package lab13;

public class Task1 {
    public static void main(String[] args) {
        String param = new String("I like Java!!!");
        System.out.println("Последний символ строки "+param.charAt(param.length()-1));
        if (param.endsWith("!!!")){
            System.out.println("Строка заканчивается подстрокой !!!");
        }
        else{
            System.out.println("Строка не заканчивается подстрокой !!!");
        }
        if (param.startsWith("I like")){
            System.out.println("Строка начинается подстрокой I like");
        }
        else{
            System.out.println("Строка не начинается подстрокой I like");
        }
        if (param.contains("Java")){
            System.out.println("Строка содержит подстроку Java");
        }
        else{
            System.out.println("Строка не содержит подстроку Java");
        }
        System.out.println("Индекс подстроки Java в строке "+param.indexOf("Java"));
        System.out.println("Замена всех символов а на о "+param.replace('a','o'));
        System.out.println("Верхний регистр "+param.toUpperCase());
        System.out.println("Нижний регистр "+param.toLowerCase());
        System.out.println("Вырезанная подстрока "+param.substring(7,11));

    }
}
