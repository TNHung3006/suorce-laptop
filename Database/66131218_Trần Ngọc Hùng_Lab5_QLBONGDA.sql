--a) Bài tập về Store Procedures:
--1
CREATE PROCEDURE sp_Greeting(
	@ten NVARCHAR(100)
)
AS
BEGIN
	PRINT N'Xin Chào ' + @ten;
	PRINT N'Gía trị tham số @ten: ' + @ten;
END;
GO
EXEC sp_Greeting @ten = N'Trần Ngọc Hùng'

DROP PROCEDURE sp_Greeting

--2
CREATE PROCEDURE sp_SoHoc(
	@s1 int,
	@s2 int,
	@tong int OUTPUT,
	@max int OUTPUT,
	@min int OUTPUT
)
AS
BEGIN
	SET @tong = @s1 + @s2;

	--IF @s1 > @s2
	--	SET @max = @s1;
	--ELSE SET @max = @s2;
	--IF @s1 > @s2
	--	SET @min = @s2;
	--ELSE SET @min = @s1;

	IF @s1 > @s2
	BEGIN
		SET @max = @s1;
		SET @min = @s2;
	END
	ELSE
    BEGIN
        SET @max = @s2;
        SET @min = @s1;
    END

	PRINT N'Tổng s1 và s2 là: ' + CAST(@tong AS NVARCHAR(10));
	PRINT N'Gía trị lớn nhất là: ' + CAST(@max AS NVARCHAR(10));
	PRINT N'Gía trị nhỏ nhất là: ' + CAST(@min AS NVARCHAR(10));
	
END;
GO

EXEC sp_SoHoc
    @s1 = 10,
    @s2 = 7,
    @tong = 0,
    @max = 0,
    @min = 0;
DROP PROCEDURE sp_SoHoc

--3
CREATE PROCEDURE insert_TINH(
	@MATINH VARCHAR(5),
	@TENTINH NVARCHAR(100),
	@RESULT NVARCHAR(100) output
)
AS
BEGIN
	DECLARE @COUNTS INT = 0;
	DECLARE @error INT;
	DECLARE @id INT;
	SELECT @COUNTS = COUNT(*) FROM dbo.TINH AS A WHERE A.MATINH=@MATINH;
	IF @COUNTS >= 1
		SET @RESULT = N'Tồn tại mã tỉnh '+@MATINH;
	ELSE
		BEGIN
			INSERT INTO TINH VALUES (@MATINH, @TENTINH);
			SELECT @error = @@ERROR, @id = SCOPE_IDENTITY();
			IF @error = 0
				SET @RESULT = N'Đã tạo dữ liệu cho mã tỉnh là: '+@MATINH;
			ELSE
				SET @RESULT = N'Đã xảy ra lỗi tạo dữ liệu với mã lỗi: '+@id;
	END
END
DECLARE @RESULT NVARCHAR(100);
EXEC INSERT_TINH 'HPH', N'HẢI PHÒNG',@RESULT OUTPUT;
SELECT @RESULT AS MESSAGES_RESULT; 