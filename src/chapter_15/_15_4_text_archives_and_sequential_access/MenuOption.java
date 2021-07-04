package chapter_15._15_4_text_archives_and_sequential_access;

public enum MenuOption {
	ZERO_BALANCE(1),
	CREDIT_BALANCE(2),
	DEBIT_BALANCE(3),
	END(4);
	
	private final int value;
	
	private MenuOption(int value) {
		this.value = value;
	}
}
