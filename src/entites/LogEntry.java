package entites;

import java.util.Date;

public class LogEntry {

	private String nameuser;
	private Date moment;
	
	public LogEntry(String nameuser, Date moment) {
		super();
		this.nameuser = nameuser;
		this.moment = moment;
	}

	public String getNameuser() {
		return nameuser;
	}

	public void setNameuser(String nameuser) {
		this.nameuser = nameuser;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameuser == null) ? 0 : nameuser.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LogEntry other = (LogEntry) obj;
		if (nameuser == null) {
			if (other.nameuser != null)
				return false;
		} else if (!nameuser.equals(other.nameuser))
			return false;
		return true;
	}
	
	
	
}
