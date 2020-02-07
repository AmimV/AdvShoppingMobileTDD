package br.com.rsinet.hub_TDD.Excel;

public class MassaDeDadosPesqHome {
	
	public String Categoria() throws Exception {
		ExcelUtils.setExcelFile(Diretorio.Path_TestData + Diretorio.File_TestData, "BuscaHome");
		String HP_Pro = ExcelUtils.getCellData(0, 0);
		return HP_Pro;
	}
	public String Logitech() throws Exception {
	ExcelUtils.setExcelFile(Diretorio.Path_TestData + Diretorio.File_TestData, "BuscaHome");
	String HP_Pro = ExcelUtils.getCellData(1, 0);
	return HP_Pro;
	}
}
