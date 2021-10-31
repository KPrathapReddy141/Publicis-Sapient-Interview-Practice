package Java8_features;


public class CreateOwnFunvtionalInterface {
	@FunctionalInterface
	interface Employee<T> {
		CreateOwnFunvtionalInterface test(T t);
	}

	public static void main(String[] args) {
		Employee<CreateOwnFunvtionalInterface> em = (CreateOwnFunvtionalInterface c) -> c;
	}
}
