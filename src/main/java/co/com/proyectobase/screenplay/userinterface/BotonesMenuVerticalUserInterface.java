package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class BotonesMenuVerticalUserInterface {

    public static final Target BTN_NUEVO_REPORTE_DIA = Target.the("Boton para crear un nuevo reporte")
            .locatedBy("//a[contains(@title,'Nuevo Detalle Reporte Dia')]");

    public static final Target BTN_CERRAR_REPORTE_DIA = Target.the("Boton para cerrar un nuevo reporte")
            .locatedBy("#Vertical_TB_Menu_DXI1_T");

    public static final Target BTN_ABRIR_DIAS_CERRADOS = Target.the("Boton para ver los dias reportados")
            .locatedBy("//li[contains(text(),'Abrir Días Cerrados')]");

    public static final Target BTN_EDITAR_REPORTE_DIA = Target.the("Boton para ver los dias reportados")
            .locatedBy("//div/a[contains(@title,'Editar')]");

}
