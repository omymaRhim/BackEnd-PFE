/*package Api.Rest.Helper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import Api.Rest.Entity.Ws;

public class ExcelHelper {
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	  static String[] HEADERs = { "ws", "libelle", "parametre", "legende","type","taille" };
	  static String SHEET = "WebService";
	  
	  
     //vérifier si un fichier est au format Excel ou non
	  public static boolean hasExcelFormat(MultipartFile file) {

	    if (!TYPE.equals(file.getContentType())) {
	      return false;
	    }

	    return true;
	  }
      //lecture InputStreamd'un fichier, retour d'une liste de WebService
	  public static List<Ws> excelToWs(InputStream is) {
	    try {
	      Workbook workbook = new XSSFWorkbook(is);

	      Sheet sheet = workbook.getSheet(SHEET);
	      Iterator<Row> rows = sheet.iterator();

	      List<Ws> webservices = new ArrayList<Ws>();

	      int rowNumber = 0;
	      while (rows.hasNext()) {
	        Row currentRow = rows.next();

	        // skip header
	        if (rowNumber == 0) {
	          rowNumber++;
	          continue;
	        }

	        Iterator<Cell> cellsInRow = currentRow.iterator();

	        Ws webservice = new Ws();

	        int cellIdx = 0;
	        while (cellsInRow.hasNext()) {
	          Cell currentCell = cellsInRow.next();

	          switch (cellIdx) {
	          case 0:
	        	  webservice.setWs((String)currentCell.getStringCellValue());
	            break;

	          case 1:
	        	  webservice.setLibelle(currentCell.getStringCellValue());
	            break;

	          case 2:
	        	  webservice.setParametre(currentCell.getStringCellValue());
	            break;

	          case 3:
	        	  webservice.setLegende(currentCell.getStringCellValue());
	            break;
	            
	          case 4:
	        	  webservice.setType(currentCell.getStringCellValue());
	            break;
	            
	          case 5:
	        	  webservice.setTaille(currentCell.getStringCellValue());
	            break;

	          default:
	            break;
	          }

	          cellIdx++;
	        }

	        webservices.add(webservice);
	      }

	      workbook.close();

	      return webservices;
	    } catch (IOException e) {
	      throw new RuntimeException("fail to parse Excel file: " + e.getMessage());
	    }
	  }

}*/
