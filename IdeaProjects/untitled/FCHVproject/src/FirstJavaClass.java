/**
 * Created by safomichev on 29.05.2017.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class FirstJavaClass extends JFrame{

    private int voron = 0;
    private int loop = 0;
    private JLabel countLabel;
    private JLabel loopCount;
    private JButton addCrow;
    private JButton removeCrow;
    private JButton resetCrow;

    public FirstJavaClass(){
        super("Crow calculator");
        //Подготавливаем компоненты объекта
        countLabel = new JLabel("Crows:" + voron);
        loopCount = new JLabel("Loops"+loop);
        addCrow = new JButton("Add Crow");
        removeCrow = new JButton("Remove Crow");
        resetCrow = new JButton("Rest Crow");

        //Подготавливаем временные компоненты
        JPanel buttonsPanel = new JPanel(new FlowLayout());
        //Расставляем компоненты по местам
        add(countLabel, BorderLayout.NORTH); //О размещении компонент поговорим позже
        add(loopCount,BorderLayout.CENTER);

        buttonsPanel.add(addCrow);
        buttonsPanel.add(removeCrow);
        buttonsPanel.add(resetCrow);

        add(buttonsPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initListeners();


    }

    private void initListeners() {
        addCrow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (voron >= 25) {
                    loop++;
                    voron = 0;
                    updateCrowCounter();
                }
                else {
                    voron = voron + 1;   /* Добавляем одну ворону  */
                    updateCrowCounter(); /* Сообщаем аппликации, что количество ворон изменилось  */
                }
            }
        });
        removeCrow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (voron > 0) {
                    voron = voron - 1;
                    updateCrowCounter(); /* Сообщаем аппликации, что количество ворон изменилось  */
                }
            }
        });
        resetCrow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                voron = 0;// Сбрасываем счетчик на 0
                updateCrowCounter();
            }
        });
    }
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if(key == KeyEvent.VK_D){
            voron = 666;
            updateCrowCounter();
        }
    }
    private void updateCrowCounter() {
        countLabel.setText("Crows:" + voron);
        loopCount.setText("Loops:"+loop);
    }

    public static void main(String []args) {
        System.out.println("Hello, world!");
        FirstJavaClass frst = new FirstJavaClass();
        frst.setVisible(true);
        frst.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна


    }
}
