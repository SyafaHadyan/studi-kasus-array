package java.array.kasus1;
import java.util.*;
import java.util.stream.*;

public class RataRataNilaiKelas
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("%-30s%-2c","Masukkan jumlah siswa",':');
        int studentAmount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < studentAmount; i++)
        {
            System.out.printf("%-30s%c%d%-2c","Masukkan nilai siswa ke",'-',(i + 1),':');
            //
        }
        input.close();
    }
}