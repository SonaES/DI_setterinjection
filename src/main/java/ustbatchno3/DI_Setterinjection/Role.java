package ustbatchno3.DI_Setterinjection;

public class Role {
	
		private String character;
		private String responsibility;
		public String getCharacter() {
			return character;
		}
		public void setCharacter(String character) {
			this.character = character;
		}
		public String getResponsibility() {
			return responsibility;
		}
		public void setResponsibility(String responsibility) {
			this.responsibility = responsibility;
		}
	
		public void display() {
			System.out.println("my name is "+character+" and my responsbility is "+responsibility );
	
}

}
