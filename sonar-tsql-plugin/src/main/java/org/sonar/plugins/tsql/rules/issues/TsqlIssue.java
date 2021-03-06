package org.sonar.plugins.tsql.rules.issues;

import org.sonar.api.batch.fs.FilePredicate;
import org.sonar.plugins.tsql.rules.AbsolutePathCaseInsensitivePredicate;

public class TsqlIssue {

	private String type;

	private String description;

	private String filePath;

	private int line;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public int getLine() {
		return line;
	}

	public void setLine(int line) {
		this.line = line;
	}

	@Override
	public String toString() {
		return this.getType() + " " + this.getDescription() + " " + this.getFilePath() + " " + this.getLine();
	}

	public FilePredicate getPredicate() {
		return new AbsolutePathCaseInsensitivePredicate(this.getFilePath());
	}
}
