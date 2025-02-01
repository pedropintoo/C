import java.util.*;

import org.stringtemplate.v4.*;

@SuppressWarnings("CheckReturnValue")
public class CsvCompiler extends CSVBaseVisitor<ST> {

   private STGroup templates = new STGroupFile("html.stg");

   @Override public ST visitFile(CSVParser.FileContext ctx) {
      // without semantic validation
      ST res = templates.getInstanceOf("module");

      res.add("header", visit(ctx.header()).render());

      for (CSVParser.RowContext row : ctx.row()) {
         res.add("row", visit(row).render());
      }
      
      return res;
   }

   @Override public ST visitHeader(CSVParser.HeaderContext ctx) {
      ST res = templates.getInstanceOf("header");

      for (CSVParser.HvalueContext hv : ctx.hvalue()) {
         ST hvalue = templates.getInstanceOf("header_values");

         hvalue.add("value", hv.getText());
         res.add("header_values", hvalue.render());
      }
      
      return res;
   }

   @Override public ST visitRow(CSVParser.RowContext ctx) {
      ST res = templates.getInstanceOf("rows");

      for (CSVParser.ValueContext rv : ctx.value()) {
         ST rvalue = templates.getInstanceOf("row_values");

         rvalue.add("value", rv.getText());
         res.add("row_values", rvalue.render());
      }
      
      return res;
   }

}
