package com.clickhouse.client;

/**
 * All formats supported by ClickHouse. More information at:
 * https://clickhouse.com/docs/en/interfaces/formats/.
 */
public enum ClickHouseFormat {
    // start with the most common ones
    RowBinary(true, true, true, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#rowbinary
    RowBinaryWithNamesAndTypes(true, true, true, true, true, RowBinary), // https://clickhouse.com/docs/en/interfaces/formats/#rowbinarywithnamesandtypes
    TabSeparated(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#tabseparated
    TabSeparatedRaw(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#tabseparatedraw
    TabSeparatedWithNames(true, true, false, true, true, TabSeparated), // https://clickhouse.com/docs/en/interfaces/formats/#tabseparatedwithnames
    TabSeparatedWithNamesAndTypes(true, true, false, true, true, TabSeparated), // https://clickhouse.com/docs/en/interfaces/formats/#tabseparatedwithnamesandtypes
    // and the rest
    Arrow(true, true, true, true, false), // https://clickhouse.com/docs/en/interfaces/formats/#arrow
    ArrowStream(true, true, true, true, false), // https://clickhouse.com/docs/en/interfaces/formats/#arrowstream
    Avro(true, true, true, true, false), // https://clickhouse.com/docs/en/interfaces/formats/#avro
    AvroConfluent(true, false, true, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#avroconfluent
    CSV(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#csv
    CSVWithNames(true, true, false, true, true, CSV), // https://clickhouse.com/docs/en/interfaces/formats/#csvwithnames
    CapnProto(true, false, true, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#capnproto
    CustomSeparated(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#customseparated
    CustomSeparatedIgnoreSpaces(true, true, false, false, true),
    JSONCompactEachRow(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#jsoncompacteachrow
    JSONCompactEachRowWithNamesAndTypes(true, true, false, true, true), // https://clickhouse.com/docs/en/interfaces/formats/#jsoncompacteachrowwithnamesandtypes
    JSON(false, true, false, false, false, JSONCompactEachRow), // https://clickhouse.com/docs/en/interfaces/formats/#json
    JSONAsString(true, false, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#jsonasstring
    JSONCompact(false, true, false, false, false, JSONCompactEachRow), // https://clickhouse.com/docs/en/interfaces/formats/#jsoncompact
    JSONCompactStringsEachRow(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#jsoncompactstringeachrow
    JSONCompactStringsEachRowWithNamesAndTypes(true, true, false, true, true, JSONCompactStringsEachRow), // https://clickhouse.com/docs/en/interfaces/formats/#jsoncompactstringeachrowwithnamesandtypes
    JSONCompactStrings(false, true, false, false, false, JSONCompactStringsEachRow), // https://clickhouse.com/docs/en/interfaces/formats/#jsoncompactstrings
    JSONEachRow(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#jsoneachrow
    JSONEachRowWithProgress(false, true, false, false, true, JSONEachRow), // https://clickhouse.com/docs/en/interfaces/formats/#jsoneachrowwithprogress
    JSONStringsEachRow(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#jsonstringseachrow
    JSONStringsEachRowWithProgress(false, true, false, false, true, JSONStringsEachRow), // https://clickhouse.com/docs/en/interfaces/formats/#jsonstringseachrowwithprogress
    JSONStringEachRow(false, false, false, false, true, JSONStringsEachRow), // https://clickhouse.com/docs/en/interfaces/formats/#jsoneachrow
    JSONStrings(false, true, false, false, false, JSONStringsEachRow), // https://clickhouse.com/docs/en/interfaces/formats/#jsonstring
    LineAsString(true, false, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#lineasstring
    Markdown(false, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#lineasstring
    MsgPack(true, true, true, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#msgpack
    MySQLWire(false, true, true, false, false),
    Native(true, true, true, true, false), // https://clickhouse.com/docs/en/interfaces/formats/#native
    Null(false, true, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#null
    ODBCDriver2(false, true, true, false, false),
    ORC(true, false, true, true, false), // https://clickhouse.com/docs/en/interfaces/formats/#orc
    Parquet(true, true, true, true, false), // https://clickhouse.com/docs/en/interfaces/formats/#parquet
    PostgreSQLWire(false, true, true, false, false),
    Pretty(false, true, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#pretty
    PrettyCompact(false, true, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#prettycompact
    PrettyCompactMonoBlock(false, true, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#prettycompactmonoblock
    PrettyCompactNoEscapes(false, true, false, false, false),
    PrettyNoEscapes(false, true, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#prettynoescapes
    PrettySpace(false, true, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#prettyspace
    PrettySpaceNoEscapes(false, true, false, false, false),
    Protobuf(true, true, true, true, false), // https://clickhouse.com/docs/en/interfaces/formats/#protobuf
    ProtobufSingle(true, true, true, true, false), // https://clickhouse.com/docs/en/interfaces/formats/#protobufsingle
    RawBLOB(true, true, true, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#rawblob
    Regexp(true, false, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#regexp
    TSKV(true, true, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#tskv
    TSV(true, true, false, false, true), // alias of TabSeparated
    TSVRaw(true, true, false, false, true), // alias of TabSeparatedRaw
    TSVWithNames(true, true, false, true, true, TSV), // alias of TabSeparatedWithNames
    TSVWithNamesAndTypes(true, true, false, true, true, TSV), // alias of TabSeparatedWithNamesAndTypes
    Template(true, true, false, true, true), // https://clickhouse.com/docs/en/interfaces/formats/#template
    TemplateIgnoreSpaces(true, false, false, true, true), // https://clickhouse.com/docs/en/interfaces/formats/#templateignorespaces
    Values(true, true, false, false, true), // https://clickhouse.com/docs/en/interfaces/formats/#values
    Vertical(false, true, false, false, false), // https://clickhouse.com/docs/en/interfaces/formats/#vertical
    XML(false, true, false, false, false); // https://clickhouse.com/docs/en/interfaces/formats/#xml

    private final boolean input;
    private final boolean output;
    private final boolean binary;
    private final boolean header;
    private final boolean rowBased;

    private final ClickHouseFormat defaultInput;

    /**
     * Simplified constructor. Same as
     * {@code new ClickHouseFormat(input, output, binary, header, rowBased, null)}.
     *
     * @param input    whether the format can be used for input
     * @param output   whether the format can be used for output
     * @param binary   whether the format is binary-based
     * @param header   whether the format contains header like names and/or
     *                 types
     * @param rowBased whether the format is row-based
     */
    ClickHouseFormat(boolean input, boolean output, boolean binary, boolean header, boolean rowBased) {
        this(input, output, binary, header, rowBased, null);
    }

    /**
     * Default constructor.
     *
     * @param input              whether the format can be used for input
     * @param output             whether the format can be used for output
     * @param binary             whether the format is binary-based
     * @param header             whether the format contains header like names
     *                           and/or types
     * @param rowBased           whether the format is row-based
     * @param defaultInputFormat default format can be used for input, null means
     *                           one of the current format, RowBinary or
     *                           TabSeparated
     */
    ClickHouseFormat(boolean input, boolean output, boolean binary, boolean header, boolean rowBased,
            ClickHouseFormat defaultInputFormat) {
        this.input = input;
        this.output = output;
        this.binary = binary;
        this.header = output && header;
        this.rowBased = rowBased;

        if (defaultInputFormat != null) {
            defaultInput = defaultInputFormat;
        } else if (input) {
            defaultInput = this;
        } else {
            String typeName = binary ? "RowBinary" : "TabSeparated";
            try {
                defaultInput = (ClickHouseFormat) getClass().getField(typeName).get(null);
            } catch (Exception e) {
                throw new IllegalArgumentException("Failed to initialize format", e);
            }
        }
    }

    /**
     * Checks if the format can be used for input.
     *
     * @return true if the format can be used for input; false otherwise
     */
    public boolean supportsInput() {
        return input;
    }

    /**
     * Checks if the format can be used for output.
     *
     * @return true if the format can be used for output; false otherwise
     */
    public boolean supportsOutput() {
        return output;
    }

    /**
     * Checks if the format is binary-based or not.
     *
     * @return true if the format is binary-based; false otherwise
     */
    public boolean isBinary() {
        return binary;
    }

    /**
     * Checks if the format is text-based or not.
     *
     * @return true if the format is text-based; false otherwise
     */
    public boolean isText() {
        return !binary;
    }

    /**
     * Checks if the format contains header like names and/or types.
     *
     * @return true if the format contains header; false otherwise
     */
    public boolean hasHeader() {
        return header;
    }

    /**
     * Check whether the format is row based(e.g. read/write by row), which is a
     * very useful hint on how to process the data.
     *
     * @return true if the format is row based; false otherwise(e.g. column,
     *         document, or structured-object etc.)
     */
    public boolean isRowBased() {
        return rowBased;
    }

    /**
     * Gets default input format, which usually does not has header.
     *
     * @return non-null input format
     */
    public ClickHouseFormat defaultInputFormat() {
        return defaultInput;
    }
}
