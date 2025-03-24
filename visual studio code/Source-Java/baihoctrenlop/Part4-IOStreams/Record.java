import java.io.Serializable;
class Record implements Serializable {
	private String name;
	private float score;
	public Record(String s, float sc) {
		name = s;
		score = sc;
	}
	public String toString() {
		return "Name: " + name + ", score: " + score;
	}
}