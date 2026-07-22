package university_management_system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MenuUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final University university = new University();

	private DefaultTableModel studentTableModel;
	private DefaultTableModel courseTableModel;
	private DefaultTableModel enrollmentTableModel;

	private JTable studentTable;
	private JTable courseTable;
	private JTable enrollmentTable;

	public MenuUI() {
		super("University Management System");
		seedSampleData();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		setLocationRelativeTo(null);

		JTabbedPane tabs = new JTabbedPane();
		tabs.addTab("Students", buildStudentsTab());
		tabs.addTab("Courses", buildCoursesTab());
		tabs.addTab("Enrollments", buildEnrollmentsTab());
		tabs.addTab("Average Grade", buildAverageGradeTab());

		add(tabs);

		refreshAllTables();
	}

	private void seedSampleData() {
		university.addStudent(new Student(401, "Raghu", "CS"));
		university.addStudent(new Student(402, "Akash", "IT"));
		university.addStudent(new Student(403, "Bikash", "CS"));
		university.addStudent(new Student(404, "Kunal", "CS"));
		university.addStudent(new Student(405, "Karan", "IT"));

		university.addCourse(new Course(101, "JAVA", 10));
		university.addCourse(new Course(102, "PYTHON", 2));
		university.addCourse(new Course(103, "REACT", 5));

		university.enrollStudent(401, 102, 91.0);
		university.enrollStudent(402, 102, 64.0);
		university.enrollStudent(403, 101, 92.0);
		university.enrollStudent(404, 101, 84.0);
		university.enrollStudent(405, 103, 85.0);
	}

	// ---------------------------------------------------------------- Students

	private JPanel buildStudentsTab() {
		JPanel panel = new JPanel(new BorderLayout(10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		studentTableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Department"}, 0) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		studentTable = new JTable(studentTableModel);
		panel.add(new JScrollPane(studentTable), BorderLayout.CENTER);

		JPanel form = new JPanel(new GridBagLayout());
		form.setBorder(BorderFactory.createTitledBorder("Add Student"));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(4, 4, 4, 4);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JTextField idField = new JTextField(6);
		JTextField nameField = new JTextField(12);
		JTextField deptField = new JTextField(8);
		JButton addButton = new JButton("Add Student");
		JLabel statusLabel = new JLabel(" ");

		int row = 0;
		addFormRow(form, gbc, row++, "ID:", idField);
		addFormRow(form, gbc, row++, "Name:", nameField);
		addFormRow(form, gbc, row++, "Department:", deptField);

		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 2;
		form.add(addButton, gbc);
		row++;
		gbc.gridy = row;
		form.add(statusLabel, gbc);

		addButton.addActionListener(e -> {
			try {
				int id = Integer.parseInt(idField.getText().trim());
				String name = nameField.getText().trim();
				String dept = deptField.getText().trim();
				if (name.isEmpty() || dept.isEmpty()) {
					statusLabel.setText("Name and Department cannot be empty.");
					return;
				}
				String result = university.addStudent(new Student(id, name, dept));
				statusLabel.setText(result);
				refreshStudentTable();
				idField.setText("");
				nameField.setText("");
				deptField.setText("");
			} catch (NumberFormatException ex) {
				statusLabel.setText("ID must be a number.");
			}
		});

		panel.add(form, BorderLayout.SOUTH);
		return panel;
	}

	// ---------------------------------------------------------------- Courses

	private JPanel buildCoursesTab() {
		JPanel panel = new JPanel(new BorderLayout(10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		courseTableModel = new DefaultTableModel(new Object[]{"ID", "Name", "Max Students", "Enrolled"}, 0) {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		courseTable = new JTable(courseTableModel);
		panel.add(new JScrollPane(courseTable), BorderLayout.CENTER);

		JPanel form = new JPanel(new GridBagLayout());
		form.setBorder(BorderFactory.createTitledBorder("Add Course"));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(4, 4, 4, 4);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JTextField idField = new JTextField(6);
		JTextField nameField = new JTextField(12);
		JTextField maxField = new JTextField(6);
		JButton addButton = new JButton("Add Course");
		JLabel statusLabel = new JLabel(" ");

		int row = 0;
		addFormRow(form, gbc, row++, "ID:", idField);
		addFormRow(form, gbc, row++, "Name:", nameField);
		addFormRow(form, gbc, row++, "Max Students:", maxField);

		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 2;
		form.add(addButton, gbc);
		row++;
		gbc.gridy = row;
		form.add(statusLabel, gbc);

		addButton.addActionListener(e -> {
			try {
				int id = Integer.parseInt(idField.getText().trim());
				String name = nameField.getText().trim();
				int max = Integer.parseInt(maxField.getText().trim());
				if (name.isEmpty()) {
					statusLabel.setText("Name cannot be empty.");
					return;
				}
				String result = university.addCourse(new Course(id, name, max));
				statusLabel.setText(result);
				refreshCourseTable();
				idField.setText("");
				nameField.setText("");
				maxField.setText("");
			} catch (NumberFormatException ex) {
				statusLabel.setText("ID and Max Students must be numbers.");
			}
		});

		panel.add(form, BorderLayout.SOUTH);
		return panel;
	}

	// ------------------------------------------------------------ Enrollments

	private JPanel buildEnrollmentsTab() {
		JPanel panel = new JPanel(new BorderLayout(10, 10));
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		enrollmentTableModel = new DefaultTableModel(
				new Object[]{"Enrollment ID", "Student", "Course", "Grade"}, 0) {
			/**
					 * 
					 */
					private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		enrollmentTable = new JTable(enrollmentTableModel);
		panel.add(new JScrollPane(enrollmentTable), BorderLayout.CENTER);

		JPanel form = new JPanel(new GridBagLayout());
		form.setBorder(BorderFactory.createTitledBorder("Enroll / Drop"));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(4, 4, 4, 4);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JTextField studentIdField = new JTextField(6);
		JTextField courseIdField = new JTextField(6);
		JTextField gradeField = new JTextField(6);
		JButton enrollButton = new JButton("Enroll Student");
		JLabel statusLabel = new JLabel(" ");

		JTextField dropIdField = new JTextField(6);
		JButton dropButton = new JButton("Drop Enrollment");

		int row = 0;
		addFormRow(form, gbc, row++, "Student ID:", studentIdField);
		addFormRow(form, gbc, row++, "Course ID:", courseIdField);
		addFormRow(form, gbc, row++, "Grade:", gradeField);

		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 2;
		form.add(enrollButton, gbc);
		row++;

		gbc.gridwidth = 1;
		addFormRow(form, gbc, row++, "Enrollment ID to Drop:", dropIdField);

		gbc.gridx = 0;
		gbc.gridy = row;
		gbc.gridwidth = 2;
		form.add(dropButton, gbc);
		row++;

		gbc.gridy = row;
		form.add(statusLabel, gbc);

		enrollButton.addActionListener(e -> {
			try {
				int sId = Integer.parseInt(studentIdField.getText().trim());
				int cId = Integer.parseInt(courseIdField.getText().trim());
				double grade = Double.parseDouble(gradeField.getText().trim());
				String result = university.enrollStudent(sId, cId, grade);
				statusLabel.setText(result);
				refreshEnrollmentTable();
				refreshCourseTable();
				studentIdField.setText("");
				courseIdField.setText("");
				gradeField.setText("");
			} catch (NumberFormatException ex) {
				statusLabel.setText("Student ID, Course ID must be integers and Grade a number.");
			}
		});

		dropButton.addActionListener(e -> {
			try {
				int id = Integer.parseInt(dropIdField.getText().trim());
				String result = university.dropEnrollment(id);
				statusLabel.setText(result);
				refreshEnrollmentTable();
				refreshCourseTable();
				dropIdField.setText("");
			} catch (NumberFormatException ex) {
				statusLabel.setText("Enrollment ID must be a number.");
			}
		});

		panel.add(form, BorderLayout.SOUTH);
		return panel;
	}

	// --------------------------------------------------------- Average Grade

	private JPanel buildAverageGradeTab() {
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.insets = new Insets(6, 6, 6, 6);
		gbc.fill = GridBagConstraints.HORIZONTAL;

		JTextField courseIdField = new JTextField(6);
		JButton calcButton = new JButton("Calculate Average Grade");
		JLabel resultLabel = new JLabel(" ");
		resultLabel.setFont(resultLabel.getFont().deriveFont(Font.BOLD, 14f));

		gbc.gridx = 0;
		gbc.gridy = 0;
		panel.add(new JLabel("Course ID:"), gbc);
		gbc.gridx = 1;
		panel.add(courseIdField, gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		panel.add(calcButton, gbc);

		gbc.gridy = 2;
		panel.add(resultLabel, gbc);

		calcButton.addActionListener(e -> {
			try {
				int cId = Integer.parseInt(courseIdField.getText().trim());
				resultLabel.setText(university.calculateAverageGrade(cId));
			} catch (NumberFormatException ex) {
				resultLabel.setText("Course ID must be a number.");
			}
		});

		return panel;
	}

	// ------------------------------------------------------------- Utilities

	private void addFormRow(JPanel form, GridBagConstraints gbc, int row, String label, JComponent field) {
		gbc.gridwidth = 1;
		gbc.gridx = 0;
		gbc.gridy = row;
		form.add(new JLabel(label), gbc);
		gbc.gridx = 1;
		form.add(field, gbc);
	}

	private void refreshStudentTable() {
		studentTableModel.setRowCount(0);
		for (Student s : university.getStudents()) {
			studentTableModel.addRow(new Object[]{s.id, s.name, s.department});
		}
	}

	private void refreshCourseTable() {
		courseTableModel.setRowCount(0);
		for (Course c : university.getCourses()) {
			courseTableModel.addRow(new Object[]{c.courseId, c.courseName, c.maxStudent, c.enrollments.size()});
		}
	}

	private void refreshEnrollmentTable() {
		enrollmentTableModel.setRowCount(0);
		for (Enrollment e : university.getEnrollments()) {
			enrollmentTableModel.addRow(new Object[]{e.enrollmentId, e.student.name, e.course.courseName, e.gread});
		}
	}

	private void refreshAllTables() {
		refreshStudentTable();
		refreshCourseTable();
		refreshEnrollmentTable();
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new MenuUI().setVisible(true));
	}
}