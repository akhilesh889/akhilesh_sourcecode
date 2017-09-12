import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	Scanner sc1=new Scanner(System.in);
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() throws Exception {
		// Add your implementation here
		return null;
	}
	try{
	if(students==null){
	System.out.println("IllegalArgumentException");
                  }

	@Override
	public void setStudents(Student[] students) throws Exception {
		// Add your implementation here
                  int index;
	Scanner index=new Scanner(System.in);
	student
	}
                  try{
                  if(students<0 || students>= students.length){
	System.out.println("IllegalArgumentException")
	                

	@Override
	public Student getStudent(int index) throws Exception{
	// Add your implementation here
	Student[index]="student";
	
	return null;
	}
	
	try{
	if(student[index]==null && index==0||index>=students.length){
	System.out.println("IllegalArgumentException")

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	StringBuffer sb = new StringBuffer(student);
	Scanner index=new Scanner(System.in)
	String str;
      	Student[index]=sb.append(str);
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
	age=sc1.nextInt();
	
	
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
	int[] maxavgmark;
	maxavgmark=Arrays.sort(avgmark);
	maxavgmark=maxavgmark.reverseOrder();	
	return maxavgmark[0];
	}

	@Override
	public Student getNextStudent(Student student) throws Exception{
		// Add your implementation here
		return null;
	}
	try{
	if(student==null)
	System.out.println("IllegalArgumentException");
	}
}
