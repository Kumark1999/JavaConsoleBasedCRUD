import java.util.*;

public class UserMain {
    public static void main(String[] args) {
            //This Console based operations are only for CRUD[CREATE,READ,UPDATE,DELETE,SEARCH]

            User user = new User();
            List<User> collect = new ArrayList<User>();
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            int ch;
            do {
                System.out.println("1.Create");
                System.out.println("2.Show All Details");
                System.out.println("3.Show All Details Based On Id");
                System.out.println("4.Delete Details");
                System.out.println("5.Update Details");
                System.out.println("5.Exit");
                System.out.println("Enter your choice:");
                ch = sc.nextInt();
                switch (ch) {
                    case 1:

                        System.out.println("Enter Id:");
                        long id = sc.nextInt();
                        System.out.println("Enter Name:");
                        String name = sc.next();
                        System.out.println("Enter Age:");
                        int age = sc.nextInt();
                        System.out.println("Enter Education :");
                        String education = sc.next();
                        System.out.println("Enter State:");
                        String state = sc.next();
                        System.out.println("Enter Gender :");
                        String gender = sc.next();
                        collect.add(new User(id, name, age, education, state, gender));
                        System.out.println("User Data Stored Success...");
                        break;
                    case 2:
                        System.out.println("******************This is Details of All Users*************");
                        Iterator<User> itr = collect.iterator();
                        while (itr.hasNext()) {
                            User u = itr.next();
                            System.out.println(u);
                            System.out.println("********************************************************");
                        }
                        break;
                    case 3:
                        boolean show = false;
                        System.out.println("Enter Id to Show:");
                        long idShow = sc.nextInt();
                        itr = collect.iterator();
                        while (itr.hasNext()) {
                            User u = itr.next();
                            if (u.getId() == idShow) {
                                System.out.println(u);
                                show = true;
                            }
                        }
                        if (!show) {
                            System.out.println("No Records Sorry....!");
                        }
                        break;
                    case 4:
                        boolean showDelete = false;
                        System.out.println("Enter Id to Delete:");
                        long idDelete = sc.nextInt();
                        itr = collect.iterator();
                        while (itr.hasNext()) {
                            User u = itr.next();
                            if (u.getId() == idDelete) {
                                itr.remove();
                                showDelete = true;
                            }
                        }
                        if (!showDelete) {
                            System.out.println("Sorry Records Are Not Found....!");
                        } else {
                            System.out.println("Records Are Deleted Successfully...");
                        }
                        break;
                    case 5:
                        boolean showUpdate = false;
                        System.out.println("Enter id to update the Details :");
                        long idUpdate = sc.nextInt();
                        ListIterator<User> list = collect.listIterator();
                        while (list.hasNext()) {
                            User u1 = list.next();
                            if (u1.getId() == idUpdate) {
                                System.out.println("Enter your Name:");
                                name = sc1.nextLine();
                                System.out.println("Enter Age :");
                                age = sc1.nextInt();
                                System.out.println("Enter Education :");
                                education = sc1.next();
                                System.out.println("Enter State:");
                                state = sc1.next();
                                System.out.println("Enter Gender:");
                                gender = sc1.next();
                                list.set(new User(idUpdate, name, age, education, state, gender));
                                showUpdate = true;
                            }
                        }
                        if (!showUpdate) {
                            System.out.println("Record are not found");
                        } else {
                            System.out.println("Record are Updated Successfully....!");
                        }
                        break;
                    case 6:
                        System.out.println("Thank You for Using Our Application....");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please Enter Correct Choice");
                        break;
                }
            } while (ch != 0);
        }
    }

