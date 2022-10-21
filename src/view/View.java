package view;

public interface View {

    void create (String data);

    void read (Long id);

    void update(String data);

    void delete(Long id);

     default void  defineOperationType(String cmd){
         String operation = cmd.split(";")[0].toLowerCase().trim();
         String data = cmd.split(";")[2];
         switch (operation){
             case "create":
                 System.out.println("This is create");
                 create(data);
                 break;
             case "read":
                 System.out.println("This is read");
                 read(Long.valueOf(data));
                 break;
             case "update":
                 System.out.println("This is update");
                 update(data);
                 break;
             case "delete":
                 System.out.println("This is delete");
                 delete(Long.valueOf(data));
                 break;
             default:
                 System.out.println("Error");
         }
     }


}
