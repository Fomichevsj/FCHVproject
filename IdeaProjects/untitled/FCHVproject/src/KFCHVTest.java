/**
 * Created by safomichev on 08.06.2017.
 */
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by User on 07.06.2017.
 */
public class KFCHVTest {

    static XSSFRow rowRead;// Строка для чтения из доукемнта
    static XSSFRow rowWrite;// Строка для записи в документ
    static List<Point> min_max = new ArrayList<Point>();// Значения минимумов и максимумов в колонке
    public static void main(String args[]) throws FileNotFoundException, IOException {

        String filePathRead = "C:\\Users\\User\\IdeaProjects\\KFCHVProject\\Data.xlsx";// Пусть к файлу с входными данными
        String filePathWrite = "C:\\Users\\User\\IdeaProjects\\KFCHVProject\\Result.xlsx";// Путь к файлу с выходными данными

/* Переменные для считывания */
        XSSFWorkbook workbookRead = new XSSFWorkbook(new FileInputStream(filePathRead));// Открыть файл на чтение
        XSSFSheet sheetRead = workbookRead.getSheet("Лист1");// Получаем лист

// Инициализируем список с минимумами и макс
        for(int i =0; i < 12; i++) {
            min_max.add(new Point(Integer.MAX_VALUE,Integer.MIN_VALUE));
        }

/* Переменные для записи */
        XSSFWorkbook workbookWrite = new XSSFWorkbook();// Откроем файл на запись ( или создадим его )
        XSSFSheet sheetWrite = workbookWrite.createSheet("ResultNorm");// Лист в который будет записан результат

        Iterator< Row > rowIterator = sheetRead.iterator();
        int row_num = 0;
/* Найдем минимальные и максимальные значения в столбцах */
        while(rowIterator.hasNext()) {
            rowRead = (XSSFRow) rowIterator.next();
            Iterator<Cell> cellIterator = rowRead.cellIterator();
            int column_num = 0;
            while (cellIterator.hasNext()) {
                Cell cellRead = cellIterator.next();// Взять очерендной элемент в очередной строке
                if(cellRead.getCellType() == Cell.CELL_TYPE_NUMERIC) {
// list1
                    if(min_max.get(column_num).getX() > cellRead.getNumericCellValue()) {
                        min_max.get(column_num).setLocation(cellRead.getNumericCellValue(), min_max.get(column_num).getY());
                        System.out.println("Нашли поменьше");
                    }
// min
                    if(min_max.get(column_num).getY() < cellRead.getNumericCellValue()) {
                        min_max.get(column_num).setLocation(min_max.get(column_num).getX(), cellRead.getNumericCellValue());
                        System.out.println("Нашли побольше");
                    }
                }
                else System.out.println(cellRead.getStringCellValue());

            }
        }

        for(int i = 0;i < min_max.size();i++) {
            System.out.println(min_max.get(i).getLocation());
        }



/* Начнем считывать данные */
        rowIterator = sheetRead.iterator();
        row_num = 0;

/* Пока не переберем все строки*/
        while (rowIterator.hasNext()) {
            System.out.println("\nСтрока номер " + row_num++);

            rowRead = (XSSFRow) rowIterator.next();// взяли в работу очередную строку
            rowWrite = sheetWrite.createRow(row_num);// создали строку для записи

            Iterator<Cell> cellIterator = rowRead.cellIterator();
            int column_num = 0;
            while (cellIterator.hasNext()) {

                Cell cellRead = cellIterator.next();// Взять очерендной элемент в очередной строке
                Cell cellWrite = rowWrite.createCell(column_num++);// Создали ячейку для записи

                switch (cellRead.getCellType()) {
                    case Cell.CELL_TYPE_BLANK:
                        System.out.print("\tЯчейка пустая");
//cellWrite.setCellValue("Здесь была пустая ячейка");
                        sheetWrite.autoSizeColumn(column_num);
                        System.out.println("\t" + cellRead + " ");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print("\tНайдено число. Нам его нужно нормировать");
                        if(cellRead.getColumnIndex() != 0) {
                            cellWrite.setCellValue(666);// Здесь нужно записать нормированное число
                            sheetWrite.autoSizeColumn(column_num);
                        }
                        else {
                            cellWrite.setCellValue(cellRead.getNumericCellValue());
                        }
                        System.out.println("\t" + cellRead + " ");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print("\tНайдена строка. Это либо название, либо что-то еще. Пропустим");
//cellWrite.setCellValue("Здесь была строка");
                        cellWrite.setCellValue(cellRead.getStringCellValue());
                        sheetWrite.autoSizeColumn(column_num);
                        System.out.println("\t" + cellRead + " ");
                        break;
                    default:
                        System.out.print("\tНайдено что-то другое. Default ветка");
//cellWrite.setCellValue("Здесь было что-то другое");
                        cellWrite.setCellValue(cellRead.getStringCellValue());
                        sheetWrite.autoSizeColumn(column_num);
                        System.out.println("\t" + cellRead + " ");
                }
            }

        }

// Запишем в файл
        workbookWrite.write(new FileOutputStream(filePathWrite));
// Закроем наши книги
        workbookRead.close();
        workbookWrite.close();

    }
}