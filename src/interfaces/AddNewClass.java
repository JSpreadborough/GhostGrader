package interfaces;


import io.parseXML;

import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import objects.MyCourse;


/**
 * Create a new course, and return it as a single MyCourse object
 * @author Lilong
 */
@SuppressWarnings("serial")
public class AddNewClass extends javax.swing.JPanel implements ActionListener{

    public String actionStatus = "waiting";
    private MainFrame parent;
    
    private MyCourse newCourse;
   
    public AddNewClass(MainFrame frame) {
    	parent = frame;
        initComponents();
        setup();
    }
    
    private void setup() {
        addButton.setActionCommand("AddNewCLass_addToTable");
    }
    
    public MyCourse getNewCourse() {
        return newCourse;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        courseName = new javax.swing.JLabel();
        courseID = new javax.swing.JLabel();
        courseNumber = new javax.swing.JLabel();
        classSection = new javax.swing.JLabel();
        classBuilding = new javax.swing.JLabel();
        classRoomNumber = new javax.swing.JLabel();
        meetingTime = new javax.swing.JLabel();
        classNameTextField = new javax.swing.JTextField();
        courseIDTextField = new javax.swing.JTextField();
        courseNumberTextField = new javax.swing.JTextField();
        classSectionTextField = new javax.swing.JTextField();
        classBuildingTextField = new javax.swing.JTextField();
        classRoomNumberTextField = new javax.swing.JTextField();
        meetingTimeTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        semester = new javax.swing.JLabel();
        semesterTextField = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add New Class", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 0, 14))); // NOI18N

        courseName.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        courseName.setText("*Course Name:");

        courseID.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        courseID.setText("*Course Prefix:");

        courseNumber.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        courseNumber.setText("*Course Number:");

        classSection.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        classSection.setText("*Course Section:");
        
        semester.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        semester.setText("*Semester:");

        classBuilding.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        classBuilding.setText("Building:");

        classRoomNumber.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        classRoomNumber.setText("Room Number:");

        meetingTime.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        meetingTime.setText("Meeting Time:");

        classNameTextField.setText(null);

        courseIDTextField.setText(null);

        courseNumberTextField.setText(null);

        classSectionTextField.setText(null);
        
        semesterTextField.setText(null);

        classBuildingTextField.setText(null);

        classRoomNumberTextField.setText(null);

        meetingTimeTextField.setText(null);

        addButton.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        addButton.setText("Create");

        cancelButton.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        cancelButton.setText("Cancel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(courseName)
                            .addComponent(courseID)
                            .addComponent(courseNumber)
                            .addComponent(classSection)
                            .addComponent(semester)
                            .addComponent(classBuilding)
                            .addComponent(classRoomNumber)
                            .addComponent(meetingTime))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(classNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                            .addComponent(courseIDTextField)
                            .addComponent(courseNumberTextField)
                            .addComponent(classSectionTextField)
                            .addComponent(semesterTextField)
                            .addComponent(classBuildingTextField)
                            .addComponent(classRoomNumberTextField)
                            .addComponent(meetingTimeTextField))
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addComponent(cancelButton)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(semester)
                .addGap(127, 127, 127)
                .addComponent(semesterTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseName)
                    .addComponent(classNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseID)
                    .addComponent(courseIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(courseNumber)
                    .addComponent(courseNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classSection)
                    .addComponent(classSectionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semester)
                    .addComponent(semesterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classBuilding)
                    .addComponent(classBuildingTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classRoomNumber)
                    .addComponent(classRoomNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meetingTime)
                    .addComponent(meetingTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getActionCommand().equals("AddNewCLass_addToTable")) {
        	generateNewCourse();
            if (parent.addNewClass.actionStatus.equals("dataReady")) {
                if (checkRepeatedCourse(getNewCourse())) {
                    addNewCourse(parent.courses.size());
                } else {
                    JOptionPane.showMessageDialog(null,
                            String.format("%33s",parent.addNewClass.getNewCourse().getName() + " " +
                            parent.addNewClass.getNewCourse().getSection() +
                            " already exists."),"Error",
                            JOptionPane.ERROR_MESSAGE);
                }
                parent.addNewClass.actionStatus = "waiting";
            }
        } else if (evt.getActionCommand().equals("Cancel")) {
            parent.setSimpleModeVisible();
        } 
    }
    
    private void generateNewCourse() {
        newCourse = new MyCourse("newCourse");
        String string_courseName = classNameTextField.getText();
        String string_courseID = courseIDTextField.getText();
        String string_courseNumber = courseNumberTextField.getText();
        String string_classSection = classSectionTextField.getText();
        String string_semester = semesterTextField.getText();
        String string_classBuilding = classBuildingTextField.getText();
        String string_classRoom = classRoomNumberTextField.getText();
        String string_meetingTime = meetingTimeTextField.getText();
        if (!textChecker(string_courseName, courseName) ||
            !textChecker(string_courseID, courseID) ||
            !textChecker(string_courseNumber, courseNumber) ||
            !textChecker(string_classSection, classSection) ||
            !textChecker(string_semester, semester) ||
            !integerChecker(string_courseNumber)) {
        } else {
            newCourse.setName(string_courseName);
            newCourse.setCourseID(string_courseID);
            int integer_courseNumber = Integer.parseInt(string_courseNumber);
            newCourse.setCourseNumber(integer_courseNumber);
            newCourse.setSection(string_classSection);
            newCourse.setBuilding(string_classBuilding);
            newCourse.setRoomID(string_classRoom);
            newCourse.setMeetingTime(string_meetingTime);
            newCourse.setSemester(string_semester);
            newCourse.setNewCourse(true);
            actionStatus = "dataReady";
        }
    }
    private void addNewCourse(int i) {
    	parseXML.saveXML(newCourse);
        parent.getCourses().add(newCourse);
        parent.simpleMode.refreshButtons();
        parent.simpleMode.setRemoveMenu();
        parent.setSimpleModeVisible();
    }

    private boolean checkRepeatedCourse(MyCourse newCourse) {
        for (int i = 0; i < parent.courses.size(); i++) {
            if (parent.courses.get(i).getIdentifier().equals(newCourse.getIdentifier())) {
                return false;
            }
        }
        return true;
    }
    
    private boolean textChecker(String text, JLabel textLabel) {
        if (text.equals((""))) {
            JOptionPane.showMessageDialog(null,
		      String.format("%33s",textLabel.getText() + " can't be empty"),"Error",
		      JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private boolean integerChecker(String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,
		      String.format("%33s",text + " is not a number"),"Error",
		      JOptionPane.ERROR_MESSAGE);
        }
        return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    public javax.swing.JButton cancelButton;
    private javax.swing.JLabel classBuilding;
    public javax.swing.JTextField classBuildingTextField;
    public javax.swing.JTextField classNameTextField;
    private javax.swing.JLabel classRoomNumber;
    public javax.swing.JTextField classRoomNumberTextField;
    private javax.swing.JLabel classSection;
    public javax.swing.JTextField classSectionTextField;
    public javax.swing.JLabel courseID;
    public javax.swing.JTextField courseIDTextField;
    public javax.swing.JLabel courseName;
    public javax.swing.JLabel courseNumber;
    public javax.swing.JTextField courseNumberTextField;
    private javax.swing.JLabel meetingTime;
    public javax.swing.JTextField meetingTimeTextField;
    public javax.swing.JTextField semesterTextField;
    private javax.swing.JLabel semester;
    // End of variables declaration//GEN-END:variables

}
