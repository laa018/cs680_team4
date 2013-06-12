package understand;

public class Understand
{
   private String Kind = null;
   private String Name = null;
   private int AltAvgLineBlank = 0;
   private int AltAvgLineCode = 0;
   private int AltAvgLineComment = 0;
   private int AltCountLineBlank = 0;
   private int AltCountLineCode = 0;
   private int AltCountLineComment = 0;
   private int AvgCyclomatic = 0;
   private int AvgCyclomaticModified = 0;
   private int AvgCyclomaticStrict = 0;
   private int AvgEssential = 0;
   private int AvgEssentialStrictModified = 0;
   private int AvgLine = 0;
   private int AvgLineBlank = 0;
   private int AvgLineCode = 0;
   private int AvgLineComment = 0;
   private int CountClassBase = 0;
   private int CountClassCoupled = 0;
   private int CountClassDerived = 0;
   private int CountDeclClass = 0;
   private int CountDeclClassMethod = 0;
   private int CountDeclClassVariable = 0;
   private int CountDeclFile = 0;
   private int CountDeclFileCode = 0;
   private int CountDeclFileHeader = 0;
   private int CountDeclFunction = 0;
   private int CountDeclInstanceMethod = 0;
   private int CountDeclInstanceVariable = 0;
   private int CountDeclInstanceVariablePrivate = 0;
   private int CountDeclInstanceVariableProtected = 0;
   private int CountDeclInstanceVariablePublic = 0;
   private int CountDeclLibunit = 0;
   private int CountDeclMethod = 0;
   private int CountDeclMethodAll = 0;
   private int CountDeclMethodConst = 0;
   private int CountDeclMethodDefault = 0;
   private int CountDeclMethodFriend = 0;
   private int CountDeclMethodPrivate = 0;
   private int CountDeclMethodProtected = 0;
   private int CountDeclMethodPublic = 0;
   private int CountDeclMethodStrictPrivate = 0;
   private int CountDeclMethodStrictPublished = 0;
   private int CountDeclModule = 0;
   private int CountDeclProgunit = 0;
   private int CountDeclSubprogram = 0;
   private int CountInput = 0;
   private int CountLine = 0;
   private int CountLine_Html = 0;
   private int CountLine_Javascript = 0;
   private int CountLine_Php = 0;
   private int CountLineBlank = 0;
   private int CountLineBlank_Html = 0;
   private int CountLineBlank_Javascript = 0;
   private int CountLineBlank_Php = 0;
   private int CountLineCode = 0;
   private int CountLineCode_Javascript = 0;
   private int CountLineCode_Php = 0;
   private int CountLineCodeDecl = 0;
   private int CountLineCodeExe = 0;
   private int CountLineComment = 0;
   private int CountLineComment_Html = 0;
   private int CountLineComment_Javascript = 0;
   private int CountLineComment_Php = 0;
   private int CountLineInactive = 0;
   private int CountLinePreprocessor = 0;
   private int CountOutput = 0;
   private int CountPackageCoupled = 0;
   private int CountPath = 0;
   private int CountSemicolon = 0;
   private int CountStmt = 0;
   private int CountStmtDecl = 0;
   private int CountStmtDecl_Javascript = 0;
   private int CountStmtDecl_Php = 0;
   private int CountStmtEmpty = 0;
   private int CountStmtExe = 0;
   private int CountStmtExe_Javascript = 0;
   private int CountStmtExe_Php = 0;
   private int Cyclomatic = 0;
   private int CyclomaticModified = 0;
   private int CyclomaticStrict = 0;
   private int Essential = 0;
   private int EssentialStrictModified = 0;
   private int Knots = 0;
   private int MaxCyclomatic = 0;
   private int MaxCyclomaticModified = 0;
   private int MaxCyclomaticStrict = 0;
   private int MaxEssential = 0;
   private int MaxEssentialKnots = 0;
   private int MaxEssentialStrictModified = 0;
   private int MaxInheritanceTree = 0;
   private int MaxNesting = 0;
   private int MinEssentialKnots = 0;
   private int PercentLackOfCohesion = 0;
   private double RatioCommentToCode = 0.0;
   private int SumCyclomatic = 0;
   private int SumCyclomaticModified = 0;
   private int SumCyclomaticStrict = 0;
   private int SumEssential = 0;
   private int SumEssentialStrictModified = 0;

   public Understand(String Kind, String Name, int AltAvgLineBlank, int AltAvgLineCode,
         int AltAvgLineComment, int AltCountLineBlank, int AltCountLineCode,
         int AltCountLineComment, int AvgCyclomatic, int AvgCyclomaticModified,
         int AvgCyclomaticStrict, int AvgEssential, int AvgEssentialStrictModified, int AvgLine,
         int AvgLineBlank, int AvgLineCode, int AvgLineComment, int CountClassBase,
         int CountClassCoupled, int CountClassDerived, int CountDeclClass,
         int CountDeclClassMethod, int CountDeclClassVariable, int CountDeclFile,
         int CountDeclFileCode, int CountDeclFileHeader, int CountDeclFunction,
         int CountDeclInstanceMethod, int CountDeclInstanceVariable,
         int CountDeclInstanceVariablePrivate, int CountDeclInstanceVariableProtected,
         int CountDeclInstanceVariablePublic, int CountDeclLibunit, int CountDeclMethod,
         int CountDeclMethodAll, int CountDeclMethodConst, int CountDeclMethodDefault,
         int CountDeclMethodFriend, int CountDeclMethodPrivate, int CountDeclMethodProtected,
         int CountDeclMethodPublic, int CountDeclMethodStrictPrivate,
         int CountDeclMethodStrictPublished, int CountDeclModule, int CountDeclProgunit,
         int CountDeclSubprogram, int CountInput, int CountLine, int CountLine_Html,
         int CountLine_Javascript, int CountLine_Php, int CountLineBlank, int CountLineBlank_Html,
         int CountLineBlank_Javascript, int CountLineBlank_Php, int CountLineCode,
         int CountLineCode_Javascript, int CountLineCode_Php, int CountLineCodeDecl,
         int CountLineCodeExe, int CountLineComment, int CountLineComment_Html,
         int CountLineComment_Javascript, int CountLineComment_Php, int CountLineInactive,
         int CountLinePreprocessor, int CountOutput, int CountPackageCoupled, int CountPath,
         int CountSemicolon, int CountStmt, int CountStmtDecl, int CountStmtDecl_Javascript,
         int CountStmtDecl_Php, int CountStmtEmpty, int CountStmtExe, int CountStmtExe_Javascript,
         int CountStmtExe_Php, int Cyclomatic, int CyclomaticModified, int CyclomaticStrict,
         int Essential, int EssentialStrictModified, int Knots, int MaxCyclomatic,
         int MaxCyclomaticModified, int MaxCyclomaticStrict, int MaxEssential,
         int MaxEssentialKnots, int MaxEssentialStrictModified, int MaxInheritanceTree,
         int MaxNesting, int MinEssentialKnots, int PercentLackOfCohesion,
         double RatioCommentToCode, int SumCyclomatic, int SumCyclomaticModified,
         int SumCyclomaticStrict, int SumEssential, int SumEssentialStrictModified)
   {
      this.Kind = Kind;
      this.Name = Name;
      this.AltAvgLineBlank = AltAvgLineBlank;
      this.AltAvgLineCode = AltAvgLineCode;
      this.AltAvgLineComment = AltAvgLineComment;
      this.AltCountLineBlank = AltCountLineBlank;
      this.AltCountLineCode = AltCountLineCode;
      this.AltCountLineComment = AltCountLineComment;
      this.AvgCyclomatic = AvgCyclomatic;
      this.AvgCyclomaticModified = AvgCyclomaticModified;
      this.AvgCyclomaticStrict = AvgCyclomaticStrict;
      this.AvgEssential = AvgEssential;
      this.AvgEssentialStrictModified = AvgEssentialStrictModified;
      this.AvgLine = AvgLine;
      this.AvgLineBlank = AvgLineBlank;
      this.AvgLineCode = AvgLineCode;
      this.AvgLineComment = AvgLineComment;
      this.CountClassBase = CountClassBase;
      this.CountClassCoupled = CountClassCoupled;
      this.CountClassDerived = CountClassDerived;
      this.CountDeclClass = CountDeclClass;
      this.CountDeclClassMethod = CountDeclClassMethod;
      this.CountDeclClassVariable = CountDeclClassVariable;
      this.CountDeclFile = CountDeclFile;
      this.CountDeclFileCode = CountDeclFileCode;
      this.CountDeclFileHeader = CountDeclFileHeader;
      this.CountDeclFunction = CountDeclFunction;
      this.CountDeclInstanceMethod = CountDeclInstanceMethod;
      this.CountDeclInstanceVariable = CountDeclInstanceVariable;
      this.CountDeclInstanceVariablePrivate = CountDeclInstanceVariablePrivate;
      this.CountDeclInstanceVariableProtected = CountDeclInstanceVariableProtected;
      this.CountDeclInstanceVariablePublic = CountDeclInstanceVariablePublic;
      this.CountDeclLibunit = CountDeclLibunit;
      this.CountDeclMethod = CountDeclMethod;
      this.CountDeclMethodAll = CountDeclMethodAll;
      this.CountDeclMethodConst = CountDeclMethodConst;
      this.CountDeclMethodDefault = CountDeclMethodDefault;
      this.CountDeclMethodFriend = CountDeclMethodFriend;
      this.CountDeclMethodPrivate = CountDeclMethodPrivate;
      this.CountDeclMethodProtected = CountDeclMethodProtected;
      this.CountDeclMethodPublic = CountDeclMethodPublic;
      this.CountDeclMethodStrictPrivate = CountDeclMethodStrictPrivate;
      this.CountDeclMethodStrictPublished = CountDeclMethodStrictPublished;
      this.CountDeclModule = CountDeclModule;
      this.CountDeclProgunit = CountDeclProgunit;
      this.CountDeclSubprogram = CountDeclSubprogram;
      this.CountInput = CountInput;
      this.CountLine = CountLine;
      this.CountLine_Html = CountLine_Html;
      this.CountLine_Javascript = CountLine_Javascript;
      this.CountLine_Php = CountLine_Php;
      this.CountLineBlank = CountLineBlank;
      this.CountLineBlank_Html = CountLineBlank_Html;
      this.CountLineBlank_Javascript = CountLineBlank_Javascript;
      this.CountLineBlank_Php = CountLineBlank_Php;
      this.CountLineCode = CountLineCode;
      this.CountLineCode_Javascript = CountLineCode_Javascript;
      this.CountLineCode_Php = CountLineCode_Php;
      this.CountLineCodeDecl = CountLineCodeDecl;
      this.CountLineCodeExe = CountLineCodeExe;
      this.CountLineComment = CountLineComment;
      this.CountLineComment_Html = CountLineComment_Html;
      this.CountLineComment_Javascript = CountLineComment_Javascript;
      this.CountLineComment_Php = CountLineComment_Php;
      this.CountLineInactive = CountLineInactive;
      this.CountLinePreprocessor = CountLinePreprocessor;
      this.CountOutput = CountOutput;
      this.CountPackageCoupled = CountPackageCoupled;
      this.CountPath = CountPath;
      this.CountSemicolon = CountSemicolon;
      this.CountStmt = CountStmt;
      this.CountStmtDecl = CountStmtDecl;
      this.CountStmtDecl_Javascript = CountStmtDecl_Javascript;
      this.CountStmtDecl_Php = CountStmtDecl_Php;
      this.CountStmtEmpty = CountStmtEmpty;
      this.CountStmtExe = CountStmtExe;
      this.CountStmtExe_Javascript = CountStmtExe_Javascript;
      this.CountStmtExe_Php = CountStmtExe_Php;
      this.Cyclomatic = Cyclomatic;
      this.CyclomaticModified = CyclomaticModified;
      this.CyclomaticStrict = CyclomaticStrict;
      this.Essential = Essential;
      this.EssentialStrictModified = EssentialStrictModified;
      this.Knots = Knots;
      this.MaxCyclomatic = MaxCyclomatic;
      this.MaxCyclomaticModified = MaxCyclomaticModified;
      this.MaxCyclomaticStrict = MaxCyclomaticStrict;
      this.MaxEssential = MaxEssential;
      this.MaxEssentialKnots = MaxEssentialKnots;
      this.MaxEssentialStrictModified = MaxEssentialStrictModified;
      this.MaxInheritanceTree = MaxInheritanceTree;
      this.MaxNesting = MaxNesting;
      this.MinEssentialKnots = MinEssentialKnots;
      this.PercentLackOfCohesion = PercentLackOfCohesion;
      this.RatioCommentToCode = RatioCommentToCode;
      this.SumCyclomatic = SumCyclomatic;
      this.SumCyclomaticModified = SumCyclomaticModified;
      this.SumCyclomaticStrict = SumCyclomaticStrict;
      this.SumEssential = SumEssential;
      this.SumEssentialStrictModified = SumEssentialStrictModified;
   }

   public String getKind()
   {
      return Kind;
   }

   public void setKind(String kind)
   {
      Kind = kind;
   }

   public String getName()
   {
      return Name;
   }

   public void setName(String name)
   {
      Name = name;
   }

   public int getAltAvgLineBlank()
   {
      return AltAvgLineBlank;
   }

   public void setAltAvgLineBlank(int altAvgLineBlank)
   {
      AltAvgLineBlank = altAvgLineBlank;
   }

   public int getAltAvgLineCode()
   {
      return AltAvgLineCode;
   }

   public void setAltAvgLineCode(int altAvgLineCode)
   {
      AltAvgLineCode = altAvgLineCode;
   }

   public int getAltAvgLineComment()
   {
      return AltAvgLineComment;
   }

   public void setAltAvgLineComment(int altAvgLineComment)
   {
      AltAvgLineComment = altAvgLineComment;
   }

   public int getAltCountLineBlank()
   {
      return AltCountLineBlank;
   }

   public void setAltCountLineBlank(int altCountLineBlank)
   {
      AltCountLineBlank = altCountLineBlank;
   }

   public int getAltCountLineCode()
   {
      return AltCountLineCode;
   }

   public void setAltCountLineCode(int altCountLineCode)
   {
      AltCountLineCode = altCountLineCode;
   }

   public int getAltCountLineComment()
   {
      return AltCountLineComment;
   }

   public void setAltCountLineComment(int altCountLineComment)
   {
      AltCountLineComment = altCountLineComment;
   }

   public int getAvgCyclomatic()
   {
      return AvgCyclomatic;
   }

   public void setAvgCyclomatic(int avgCyclomatic)
   {
      AvgCyclomatic = avgCyclomatic;
   }

   public int getAvgCyclomaticModified()
   {
      return AvgCyclomaticModified;
   }

   public void setAvgCyclomaticModified(int avgCyclomaticModified)
   {
      AvgCyclomaticModified = avgCyclomaticModified;
   }

   public int getAvgCyclomaticStrict()
   {
      return AvgCyclomaticStrict;
   }

   public void setAvgCyclomaticStrict(int avgCyclomaticStrict)
   {
      AvgCyclomaticStrict = avgCyclomaticStrict;
   }

   public int getAvgEssential()
   {
      return AvgEssential;
   }

   public void setAvgEssential(int avgEssential)
   {
      AvgEssential = avgEssential;
   }

   public int getAvgEssentialStrictModified()
   {
      return AvgEssentialStrictModified;
   }

   public void setAvgEssentialStrictModified(int avgEssentialStrictModified)
   {
      AvgEssentialStrictModified = avgEssentialStrictModified;
   }

   public int getAvgLine()
   {
      return AvgLine;
   }

   public void setAvgLine(int avgLine)
   {
      AvgLine = avgLine;
   }

   public int getAvgLineBlank()
   {
      return AvgLineBlank;
   }

   public void setAvgLineBlank(int avgLineBlank)
   {
      AvgLineBlank = avgLineBlank;
   }

   public int getAvgLineCode()
   {
      return AvgLineCode;
   }

   public void setAvgLineCode(int avgLineCode)
   {
      AvgLineCode = avgLineCode;
   }

   public int getAvgLineComment()
   {
      return AvgLineComment;
   }

   public void setAvgLineComment(int avgLineComment)
   {
      AvgLineComment = avgLineComment;
   }

   public int getCountClassBase()
   {
      return CountClassBase;
   }

   public void setCountClassBase(int countClassBase)
   {
      CountClassBase = countClassBase;
   }

   public int getCountClassCoupled()
   {
      return CountClassCoupled;
   }

   public void setCountClassCoupled(int countClassCoupled)
   {
      CountClassCoupled = countClassCoupled;
   }

   public int getCountClassDerived()
   {
      return CountClassDerived;
   }

   public void setCountClassDerived(int countClassDerived)
   {
      CountClassDerived = countClassDerived;
   }

   public int getCountDeclClass()
   {
      return CountDeclClass;
   }

   public void setCountDeclClass(int countDeclClass)
   {
      CountDeclClass = countDeclClass;
   }

   public int getCountDeclClassMethod()
   {
      return CountDeclClassMethod;
   }

   public void setCountDeclClassMethod(int countDeclClassMethod)
   {
      CountDeclClassMethod = countDeclClassMethod;
   }

   public int getCountDeclClassVariable()
   {
      return CountDeclClassVariable;
   }

   public void setCountDeclClassVariable(int countDeclClassVariable)
   {
      CountDeclClassVariable = countDeclClassVariable;
   }

   public int getCountDeclFile()
   {
      return CountDeclFile;
   }

   public void setCountDeclFile(int countDeclFile)
   {
      CountDeclFile = countDeclFile;
   }

   public int getCountDeclFileCode()
   {
      return CountDeclFileCode;
   }

   public void setCountDeclFileCode(int countDeclFileCode)
   {
      CountDeclFileCode = countDeclFileCode;
   }

   public int getCountDeclFileHeader()
   {
      return CountDeclFileHeader;
   }

   public void setCountDeclFileHeader(int countDeclFileHeader)
   {
      CountDeclFileHeader = countDeclFileHeader;
   }

   public int getCountDeclFunction()
   {
      return CountDeclFunction;
   }

   public void setCountDeclFunction(int countDeclFunction)
   {
      CountDeclFunction = countDeclFunction;
   }

   public int getCountDeclInstanceMethod()
   {
      return CountDeclInstanceMethod;
   }

   public void setCountDeclInstanceMethod(int countDeclInstanceMethod)
   {
      CountDeclInstanceMethod = countDeclInstanceMethod;
   }

   public int getCountDeclInstanceVariable()
   {
      return CountDeclInstanceVariable;
   }

   public void setCountDeclInstanceVariable(int countDeclInstanceVariable)
   {
      CountDeclInstanceVariable = countDeclInstanceVariable;
   }

   public int getCountDeclInstanceVariablePrivate()
   {
      return CountDeclInstanceVariablePrivate;
   }

   public void setCountDeclInstanceVariablePrivate(int countDeclInstanceVariablePrivate)
   {
      CountDeclInstanceVariablePrivate = countDeclInstanceVariablePrivate;
   }

   public int getCountDeclInstanceVariableProtected()
   {
      return CountDeclInstanceVariableProtected;
   }

   public void setCountDeclInstanceVariableProtected(int countDeclInstanceVariableProtected)
   {
      CountDeclInstanceVariableProtected = countDeclInstanceVariableProtected;
   }

   public int getCountDeclInstanceVariablePublic()
   {
      return CountDeclInstanceVariablePublic;
   }

   public void setCountDeclInstanceVariablePublic(int countDeclInstanceVariablePublic)
   {
      CountDeclInstanceVariablePublic = countDeclInstanceVariablePublic;
   }

   public int getCountDeclLibunit()
   {
      return CountDeclLibunit;
   }

   public void setCountDeclLibunit(int countDeclLibunit)
   {
      CountDeclLibunit = countDeclLibunit;
   }

   public int getCountDeclMethod()
   {
      return CountDeclMethod;
   }

   public void setCountDeclMethod(int countDeclMethod)
   {
      CountDeclMethod = countDeclMethod;
   }

   public int getCountDeclMethodAll()
   {
      return CountDeclMethodAll;
   }

   public void setCountDeclMethodAll(int countDeclMethodAll)
   {
      CountDeclMethodAll = countDeclMethodAll;
   }

   public int getCountDeclMethodConst()
   {
      return CountDeclMethodConst;
   }

   public void setCountDeclMethodConst(int countDeclMethodConst)
   {
      CountDeclMethodConst = countDeclMethodConst;
   }

   public int getCountDeclMethodDefault()
   {
      return CountDeclMethodDefault;
   }

   public void setCountDeclMethodDefault(int countDeclMethodDefault)
   {
      CountDeclMethodDefault = countDeclMethodDefault;
   }

   public int getCountDeclMethodFriend()
   {
      return CountDeclMethodFriend;
   }

   public void setCountDeclMethodFriend(int countDeclMethodFriend)
   {
      CountDeclMethodFriend = countDeclMethodFriend;
   }

   public int getCountDeclMethodPrivate()
   {
      return CountDeclMethodPrivate;
   }

   public void setCountDeclMethodPrivate(int countDeclMethodPrivate)
   {
      CountDeclMethodPrivate = countDeclMethodPrivate;
   }

   public int getCountDeclMethodProtected()
   {
      return CountDeclMethodProtected;
   }

   public void setCountDeclMethodProtected(int countDeclMethodProtected)
   {
      CountDeclMethodProtected = countDeclMethodProtected;
   }

   public int getCountDeclMethodPublic()
   {
      return CountDeclMethodPublic;
   }

   public void setCountDeclMethodPublic(int countDeclMethodPublic)
   {
      CountDeclMethodPublic = countDeclMethodPublic;
   }

   public int getCountDeclMethodStrictPrivate()
   {
      return CountDeclMethodStrictPrivate;
   }

   public void setCountDeclMethodStrictPrivate(int countDeclMethodStrictPrivate)
   {
      CountDeclMethodStrictPrivate = countDeclMethodStrictPrivate;
   }

   public int getCountDeclMethodStrictPublished()
   {
      return CountDeclMethodStrictPublished;
   }

   public void setCountDeclMethodStrictPublished(int countDeclMethodStrictPublished)
   {
      CountDeclMethodStrictPublished = countDeclMethodStrictPublished;
   }

   public int getCountDeclModule()
   {
      return CountDeclModule;
   }

   public void setCountDeclModule(int countDeclModule)
   {
      CountDeclModule = countDeclModule;
   }

   public int getCountDeclProgunit()
   {
      return CountDeclProgunit;
   }

   public void setCountDeclProgunit(int countDeclProgunit)
   {
      CountDeclProgunit = countDeclProgunit;
   }

   public int getCountDeclSubprogram()
   {
      return CountDeclSubprogram;
   }

   public void setCountDeclSubprogram(int countDeclSubprogram)
   {
      CountDeclSubprogram = countDeclSubprogram;
   }

   public int getCountInput()
   {
      return CountInput;
   }

   public void setCountInput(int countInput)
   {
      CountInput = countInput;
   }

   public int getCountLine()
   {
      return CountLine;
   }

   public void setCountLine(int countLine)
   {
      CountLine = countLine;
   }

   public int getCountLine_Html()
   {
      return CountLine_Html;
   }

   public void setCountLine_Html(int countLine_Html)
   {
      CountLine_Html = countLine_Html;
   }

   public int getCountLine_Javascript()
   {
      return CountLine_Javascript;
   }

   public void setCountLine_Javascript(int countLine_Javascript)
   {
      CountLine_Javascript = countLine_Javascript;
   }

   public int getCountLine_Php()
   {
      return CountLine_Php;
   }

   public void setCountLine_Php(int countLine_Php)
   {
      CountLine_Php = countLine_Php;
   }

   public int getCountLineBlank()
   {
      return CountLineBlank;
   }

   public void setCountLineBlank(int countLineBlank)
   {
      CountLineBlank = countLineBlank;
   }

   public int getCountLineBlank_Html()
   {
      return CountLineBlank_Html;
   }

   public void setCountLineBlank_Html(int countLineBlank_Html)
   {
      CountLineBlank_Html = countLineBlank_Html;
   }

   public int getCountLineBlank_Javascript()
   {
      return CountLineBlank_Javascript;
   }

   public void setCountLineBlank_Javascript(int countLineBlank_Javascript)
   {
      CountLineBlank_Javascript = countLineBlank_Javascript;
   }

   public int getCountLineBlank_Php()
   {
      return CountLineBlank_Php;
   }

   public void setCountLineBlank_Php(int countLineBlank_Php)
   {
      CountLineBlank_Php = countLineBlank_Php;
   }

   public int getCountLineCode()
   {
      return CountLineCode;
   }

   public void setCountLineCode(int countLineCode)
   {
      CountLineCode = countLineCode;
   }

   public int getCountLineCode_Javascript()
   {
      return CountLineCode_Javascript;
   }

   public void setCountLineCode_Javascript(int countLineCode_Javascript)
   {
      CountLineCode_Javascript = countLineCode_Javascript;
   }

   public int getCountLineCode_Php()
   {
      return CountLineCode_Php;
   }

   public void setCountLineCode_Php(int countLineCode_Php)
   {
      CountLineCode_Php = countLineCode_Php;
   }

   public int getCountLineCodeDecl()
   {
      return CountLineCodeDecl;
   }

   public void setCountLineCodeDecl(int countLineCodeDecl)
   {
      CountLineCodeDecl = countLineCodeDecl;
   }

   public int getCountLineCodeExe()
   {
      return CountLineCodeExe;
   }

   public void setCountLineCodeExe(int countLineCodeExe)
   {
      CountLineCodeExe = countLineCodeExe;
   }

   public int getCountLineComment()
   {
      return CountLineComment;
   }

   public void setCountLineComment(int countLineComment)
   {
      CountLineComment = countLineComment;
   }

   public int getCountLineComment_Html()
   {
      return CountLineComment_Html;
   }

   public void setCountLineComment_Html(int countLineComment_Html)
   {
      CountLineComment_Html = countLineComment_Html;
   }

   public int getCountLineComment_Javascript()
   {
      return CountLineComment_Javascript;
   }

   public void setCountLineComment_Javascript(int countLineComment_Javascript)
   {
      CountLineComment_Javascript = countLineComment_Javascript;
   }

   public int getCountLineComment_Php()
   {
      return CountLineComment_Php;
   }

   public void setCountLineComment_Php(int countLineComment_Php)
   {
      CountLineComment_Php = countLineComment_Php;
   }

   public int getCountLineInactive()
   {
      return CountLineInactive;
   }

   public void setCountLineInactive(int countLineInactive)
   {
      CountLineInactive = countLineInactive;
   }

   public int getCountLinePreprocessor()
   {
      return CountLinePreprocessor;
   }

   public void setCountLinePreprocessor(int countLinePreprocessor)
   {
      CountLinePreprocessor = countLinePreprocessor;
   }

   public int getCountOutput()
   {
      return CountOutput;
   }

   public void setCountOutput(int countOutput)
   {
      CountOutput = countOutput;
   }

   public int getCountPackageCoupled()
   {
      return CountPackageCoupled;
   }

   public void setCountPackageCoupled(int countPackageCoupled)
   {
      CountPackageCoupled = countPackageCoupled;
   }

   public int getCountPath()
   {
      return CountPath;
   }

   public void setCountPath(int countPath)
   {
      CountPath = countPath;
   }

   public int getCountSemicolon()
   {
      return CountSemicolon;
   }

   public void setCountSemicolon(int countSemicolon)
   {
      CountSemicolon = countSemicolon;
   }

   public int getCountStmt()
   {
      return CountStmt;
   }

   public void setCountStmt(int countStmt)
   {
      CountStmt = countStmt;
   }

   public int getCountStmtDecl()
   {
      return CountStmtDecl;
   }

   public void setCountStmtDecl(int countStmtDecl)
   {
      CountStmtDecl = countStmtDecl;
   }

   public int getCountStmtDecl_Javascript()
   {
      return CountStmtDecl_Javascript;
   }

   public void setCountStmtDecl_Javascript(int countStmtDecl_Javascript)
   {
      CountStmtDecl_Javascript = countStmtDecl_Javascript;
   }

   public int getCountStmtDecl_Php()
   {
      return CountStmtDecl_Php;
   }

   public void setCountStmtDecl_Php(int countStmtDecl_Php)
   {
      CountStmtDecl_Php = countStmtDecl_Php;
   }

   public int getCountStmtEmpty()
   {
      return CountStmtEmpty;
   }

   public void setCountStmtEmpty(int countStmtEmpty)
   {
      CountStmtEmpty = countStmtEmpty;
   }

   public int getCountStmtExe()
   {
      return CountStmtExe;
   }

   public void setCountStmtExe(int countStmtExe)
   {
      CountStmtExe = countStmtExe;
   }

   public int getCountStmtExe_Javascript()
   {
      return CountStmtExe_Javascript;
   }

   public void setCountStmtExe_Javascript(int countStmtExe_Javascript)
   {
      CountStmtExe_Javascript = countStmtExe_Javascript;
   }

   public int getCountStmtExe_Php()
   {
      return CountStmtExe_Php;
   }

   public void setCountStmtExe_Php(int countStmtExe_Php)
   {
      CountStmtExe_Php = countStmtExe_Php;
   }

   public int getCyclomatic()
   {
      return Cyclomatic;
   }

   public void setCyclomatic(int cyclomatic)
   {
      Cyclomatic = cyclomatic;
   }

   public int getCyclomaticModified()
   {
      return CyclomaticModified;
   }

   public void setCyclomaticModified(int cyclomaticModified)
   {
      CyclomaticModified = cyclomaticModified;
   }

   public int getCyclomaticStrict()
   {
      return CyclomaticStrict;
   }

   public void setCyclomaticStrict(int cyclomaticStrict)
   {
      CyclomaticStrict = cyclomaticStrict;
   }

   public int getEssential()
   {
      return Essential;
   }

   public void setEssential(int essential)
   {
      Essential = essential;
   }

   public int getEssentialStrictModified()
   {
      return EssentialStrictModified;
   }

   public void setEssentialStrictModified(int essentialStrictModified)
   {
      EssentialStrictModified = essentialStrictModified;
   }

   public int getKnots()
   {
      return Knots;
   }

   public void setKnots(int knots)
   {
      Knots = knots;
   }

   public int getMaxCyclomatic()
   {
      return MaxCyclomatic;
   }

   public void setMaxCyclomatic(int maxCyclomatic)
   {
      MaxCyclomatic = maxCyclomatic;
   }

   public int getMaxCyclomaticModified()
   {
      return MaxCyclomaticModified;
   }

   public void setMaxCyclomaticModified(int maxCyclomaticModified)
   {
      MaxCyclomaticModified = maxCyclomaticModified;
   }

   public int getMaxCyclomaticStrict()
   {
      return MaxCyclomaticStrict;
   }

   public void setMaxCyclomaticStrict(int maxCyclomaticStrict)
   {
      MaxCyclomaticStrict = maxCyclomaticStrict;
   }

   public int getMaxEssential()
   {
      return MaxEssential;
   }

   public void setMaxEssential(int maxEssential)
   {
      MaxEssential = maxEssential;
   }

   public int getMaxEssentialKnots()
   {
      return MaxEssentialKnots;
   }

   public void setMaxEssentialKnots(int maxEssentialKnots)
   {
      MaxEssentialKnots = maxEssentialKnots;
   }

   public int getMaxEssentialStrictModified()
   {
      return MaxEssentialStrictModified;
   }

   public void setMaxEssentialStrictModified(int maxEssentialStrictModified)
   {
      MaxEssentialStrictModified = maxEssentialStrictModified;
   }

   public int getMaxInheritanceTree()
   {
      return MaxInheritanceTree;
   }

   public void setMaxInheritanceTree(int maxInheritanceTree)
   {
      MaxInheritanceTree = maxInheritanceTree;
   }

   public int getMaxNesting()
   {
      return MaxNesting;
   }

   public void setMaxNesting(int maxNesting)
   {
      MaxNesting = maxNesting;
   }

   public int getMinEssentialKnots()
   {
      return MinEssentialKnots;
   }

   public void setMinEssentialKnots(int minEssentialKnots)
   {
      MinEssentialKnots = minEssentialKnots;
   }

   public int getPercentLackOfCohesion()
   {
      return PercentLackOfCohesion;
   }

   public void setPercentLackOfCohesion(int percentLackOfCohesion)
   {
      PercentLackOfCohesion = percentLackOfCohesion;
   }

   public double getRatioCommentToCode()
   {
      return RatioCommentToCode;
   }

   public void setRatioCommentToCode(double ratioCommentToCode)
   {
      RatioCommentToCode = ratioCommentToCode;
   }

   public int getSumCyclomatic()
   {
      return SumCyclomatic;
   }

   public void setSumCyclomatic(int sumCyclomatic)
   {
      SumCyclomatic = sumCyclomatic;
   }

   public int getSumCyclomaticModified()
   {
      return SumCyclomaticModified;
   }

   public void setSumCyclomaticModified(int sumCyclomaticModified)
   {
      SumCyclomaticModified = sumCyclomaticModified;
   }

   public int getSumCyclomaticStrict()
   {
      return SumCyclomaticStrict;
   }

   public void setSumCyclomaticStrict(int sumCyclomaticStrict)
   {
      SumCyclomaticStrict = sumCyclomaticStrict;
   }

   public int getSumEssential()
   {
      return SumEssential;
   }

   public void setSumEssential(int sumEssential)
   {
      SumEssential = sumEssential;
   }

   public int getSumEssentialStrictModified()
   {
      return SumEssentialStrictModified;
   }

   public void setSumEssentialStrictModified(int sumEssentialStrictModified)
   {
      SumEssentialStrictModified = sumEssentialStrictModified;
   }
}