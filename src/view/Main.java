package view;

import java.util.Scanner;

public class Main {
    private static final View skillView = new SkillView();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data in format : Func; Type; Data ");
        while (scanner.hasNext()){
            String cmd = scanner.nextLine();
            String[] cmdArray = cmd.split(";");
            switch (cmdArray[1].toLowerCase().trim()){
                case "skill":
                    System.out.println("this is skill");
                    skillView.defineOperationType(cmd);

                    break;
                case "developer":
                    System.out.println("this is developer");
                    break;
                case "team":
                    System.out.println("this is team");
                    break;
                default:
                    System.out.println("Error");
            }

        }
    }
}
