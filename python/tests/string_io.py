import io


class StringIO(io.StringIO):
    """
    A "safely" wrapped version
    """

    def __init__(self, value=''):
        value = value.encode('utf8', 'backslashreplace').decode('utf8')
        io.StringIO.__init__(self, value)
        self.__buffer = []

    def write(self, msg):
        self.__buffer.append(str(msg))
        io.StringIO.write(self, msg.encode('utf8', 'backslashreplace').decode('utf8'))

    def getValue(self):
        return "".join(self.__buffer)
