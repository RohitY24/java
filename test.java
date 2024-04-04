import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class YourCReportDataModelBuilderItr5Y2019CorpGenericTestlassTest {

    @Test
    void testScheduleIFNotNull() {
        // Arrange
        Itr5Data itr5Data = mock(Itr5Data.class);
        CommonUtil commonUtil = mock(CommonUtil.class);
        ProfitAndLossCsvFieldNames profitAndLossCsvFieldNames = mock(ProfitAndLossCsvFieldNames.class);

        when(itr5Data.getITR5().get(anyInt()).getScheduleIF()).thenReturn(new ScheduleIF());
        when(commonUtil.defaultValueOfObject(any())).thenReturn("default");

        // Act
        YourClass yourClass = new YourClass(itr5Data, commonUtil, profitAndLossCsvFieldNames);
        yourClass.yourMethod();

        // Assert
        verify(profitAndLossCsvFieldNames).setPlitr356ShareOfProfit("default");
    }

    @Test
    void testPARTAPLNotNull() {
        // Arrange
        Itr5Data itr5Data = mock(Itr5Data.class);
        CommonUtil commonUtil = mock(CommonUtil.class);
        ProfitAndLossCsvFieldNames profitAndLossCsvFieldNames = mock(ProfitAndLossCsvFieldNames.class);

        when(itr5Data.getITR5().get(anyInt()).getPARTAPL()).thenReturn(new PARTAPL());
        when(commonUtil.defaultValueOfObject(any())).thenReturn("default");

        // Act
        YourClass yourClass = new YourClass(itr5Data, commonUtil, profitAndLossCsvFieldNames);
        yourClass.yourMethod();

        // Assert
        verify(profitAndLossCsvFieldNames).setPlitr356InterestOnCapital("default");
    }
}