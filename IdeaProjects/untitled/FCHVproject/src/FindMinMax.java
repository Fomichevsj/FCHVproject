import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * Created by User on 08.06.2017.
 */
public class FindMinMax {


    static XSSFRow rowRead;// Строка для чтения из доукемнта
    static XSSFRow rowWrite;// Строка для записи в документ
    static java.util.List<Double> list1 = new ArrayList<Double>();// вспомогательный
    static java.util.List<Double> min = new ArrayList<Double>();// Значение минимумов в колонке
    static java.util.List<Double> max = new ArrayList<Double>();// Значение минимумов в колонке
    static java.util.List<String> name = new ArrayList<String>();// Значение названия  колонки

    public static void main(String args[]) throws FileNotFoundException, IOException {


        String filePathRead = "C:\\Users\\safomichev\\IdeaProjects\\untitled\\dannye.xlsx";// Пусть к файлу с входными данными
        String filePathWrite = "C:\\Users\\safomichev\\IdeaProjects\\untitled\\Result.xlsx";// Путь к файлу с выходными данными

        /* Переменные для считывания */
        XSSFWorkbook workbookRead = new XSSFWorkbook(new FileInputStream(filePathRead));// Открыть файл на чтение
        XSSFSheet sheetRead = workbookRead.getSheet("Лист1");// Получаем лист
        // Инициализируем список с значениями столбца
        for (int i = 0; i < sheetRead.getPhysicalNumberOfRows()-1; i++) {
            list1.add(new Double(0));
        }

        for (int i =0; i < sheetRead.getRow(0).getLastCellNum(); i++) {
            min.add(new Double(0));
            name.add("");
        }
        System.out.println("Size of min = " + min.size());

        /* Переменные для записи */
        XSSFWorkbook workbookWrite = new XSSFWorkbook();// Откроем файл на запись ( или создадим его )
        XSSFSheet sheetWrite = workbookWrite.createSheet("ResultNorm");// Лист в который будет записан результат

        Iterator<Row> rowIterator = sheetRead.iterator();
        Iterator<Cell> cellIterator;

        for (int i = 0; i < sheetRead.getRow(0).getLastCellNum(); i++) {
            // i - Номер столбца
            rowIterator = sheetRead.iterator();
            int j = 0;// Номер эелемента в в списке
            int m =0;// Номер строки
            boolean exit = false;

            rowRead = (XSSFRow) rowIterator.next();
            System.out.println(" " + rowRead.getCell(i) + " ");
            name.set(i,rowRead.getCell(i).toString());

            rowIterator = sheetRead.iterator();
            while (rowIterator.hasNext()) {
                if(exit) {
                    System.out.println("Выходим из цикла while");
                    break;
                }
                rowRead = (XSSFRow) rowIterator.next();
                Cell cell = rowRead.getCell(i);
                if (cell!= null)
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            list1.set(j++,cell.getNumericCellValue());
                            m++;
                            System.out.println("\tЗначение " + cell.getNumericCellValue());
                            break;
                        case Cell.CELL_TYPE_BLANK:
                            break;
                        default:
                            if(m > 0) {
                                System.out.println("\tВ столбце не численные данные. Нужно выйти");
                                exit = true;
                            }
                            else {
                                m++;
                                System.out.println("\tDefault");

                            }
                            break;
                    }
            }

            if(exit) {
                System.out.println("\t\tВ этом столбце нам не нужно искать минимум.");
                continue;
            }
            double min = Double.MAX_VALUE;
            for(int k = 0;k < list1.size(); k++) {
                if(list1.get(k) < min) {
                    min = list1.get(k);
                    System.out.println("\t\tНашел значение меньше: " + min);
                }
            }
            // Обнулим список
            for (int k = 0; k < sheetRead.getPhysicalNumberOfRows()-1; k++) {
                list1.set(k, Double.MAX_VALUE);
            }
            FindMinMax.min.set(i,min);
            System.out.println("Min value = " + min);
            System.out.println("\n");
        }

        for(int i =0; i < name.size(); i++) {
            System.out.print(name.get(i));
            System.out.println("\t" + min.get(i));
        }
        /*System.out.println("Colum: " + name);
        System.out.println("List: " + min);*/
        workbookRead.close();
        workbookWrite.close();
    }
}