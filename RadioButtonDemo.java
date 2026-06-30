package radiobuttondemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    JLabel imageLabel;
    JRadioButton bird, cat, dog, rabbit, pig;

    ButtonGroup group;

    public RadioButtonDemo() {

        setTitle("Radio Button Demo");
        setSize(600,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        group = new ButtonGroup();
        group.add(bird);
        group.add(cat);
        group.add(dog);
        group.add(rabbit);
        group.add(pig);

        add(bird);
        add(cat);
        add(dog);
        add(rabbit);
        add(pig);

        imageLabel = new JLabel();
        add(imageLabel);

        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String pet = "";

        if(bird.isSelected()){
            pet = "Bird";
            imageLabel.setIcon(new ImageIcon("images/bird.jpg"));
        }

        if(cat.isSelected()){
            pet = "Cat";
            imageLabel.setIcon(new ImageIcon("images/cat.jpg"));
        }

        if(dog.isSelected()){
            pet = "Dog";
            imageLabel.setIcon(new ImageIcon("images/dog.jpg"));
        }

        if(rabbit.isSelected()){
            pet = "Rabbit";
            imageLabel.setIcon(new ImageIcon("images/rabbit.jpg"));
        }

        if(pig.isSelected()){
            pet = "Pig";
            imageLabel.setIcon(new ImageIcon("images/pig.jpg"));
        }

        JOptionPane.showMessageDialog(this,
                "You selected: " + pet);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}