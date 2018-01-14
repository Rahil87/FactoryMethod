package factory;

public class TeacherCreator implements Factory {

	
	// bu metodun funksiyasi melumatlari database(mysql)den oxumaqdir
	@Override
	public Product getData() {
		/*burada jdbcTemplate ve ya Sessionfactory vasitesi ile
		 getData metodu cagrilir ve melumatlar databaseden oxunur.
		 */
		
		
		
		return new Teacher();
	}

}
